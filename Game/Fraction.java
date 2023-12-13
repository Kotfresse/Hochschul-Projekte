/**
 * @author Tri Nguyen
 **/
import java.math.BigInteger;
final public class Fraction extends Number implements Comparable<Fraction>{
    private BigInteger numerator, denominator;
    
    public static void main(String[] args) {
        /*
        
        Fraction Alex = new Fraction(3,3);
        Fraction Flaucher = new Fraction("6", "3");
        Fraction Helen = new Fraction(BigInteger.valueOf(3), BigInteger.valueOf(2));
        Fraction Lennard = new Fraction(2, 1);
        System.out.println(Alex.toString()+" e");
        System.out.println(Flaucher.toString());
        System.out.println(Helen.toString());
           System.out.println(Lennard.toString());
        System.out.println(Alex.add(Flaucher));
        */
         
    }
    //private Fraction(){} // private constructor
    public Fraction(long numerator, long denominator) {
        if(denominator==0){
            this.numerator=BigInteger.ZERO;
            this.denominator=BigInteger.ZERO;
        }else{

            this.numerator = BigInteger.valueOf(numerator);
            this.denominator = BigInteger.valueOf(denominator);
            BigInteger gcd = ggT(this.numerator, this.denominator);
            this.numerator=this.numerator.divide(gcd);
            this.denominator=this.denominator.divide(gcd);
            if(this.denominator.signum()==-1){
                this.numerator=this.numerator.multiply(BigInteger.valueOf(-1));
                this.denominator=this.denominator.multiply(BigInteger.valueOf(-1));
            }
        }

    }
    public Fraction(BigInteger numerator, BigInteger denominator) {
        if(denominator.equals(BigInteger.ZERO)){
            this.numerator=BigInteger.ZERO;
            this.denominator=BigInteger.ZERO;
        }else{
        this.numerator = numerator;
        this.denominator = denominator;
        BigInteger gcd = ggT(this.numerator, this.denominator);
        this.numerator=this.numerator.divide(gcd);
        this.denominator=this.denominator.divide(gcd);
        if(this.denominator.signum()==-1){
            this.numerator=this.numerator.multiply(BigInteger.valueOf(-1));
            this.denominator=this.denominator.multiply(BigInteger.valueOf(-1));
                }
        }
    }
    public Fraction(String numerator, String denominator) {
        if(denominator.equals("0")){
            this.numerator=BigInteger.ZERO;
            this.denominator=BigInteger.ZERO;
        }else{
        this.numerator = new BigInteger(numerator);
        this.denominator = new BigInteger(denominator);
        BigInteger gcd = ggT(this.numerator, this.denominator);
        this.numerator=this.numerator.divide(gcd);
        this.denominator=this.denominator.divide(gcd);
        if(this.denominator.signum()==-1){
            this.numerator=this.numerator.multiply(BigInteger.valueOf(-1));
            this.denominator=this.denominator.multiply(BigInteger.valueOf(-1));
        }
        }
        
    }
    @Override
    public boolean equals(Object o){
        if(o == null){
            return false;
        }
        if(o.getClass() != this.getClass()){
            return false;
        }
        final Fraction r = (Fraction) o;
        if(!this.numerator.equals(r.numerator) || !this.denominator.equals(r.denominator)){
            return false;
        }
        return true;
    }
    @Override
    public int hashCode(){
        final int prime =31;
        int result = 1;
        result = prime * result +this.numerator.hashCode();
        result= prime * result + this.denominator.hashCode();
        return result;

    }
    @Override
    public int compareTo(Fraction r){
        BigInteger num = numerator.multiply(r.denominator);
        BigInteger den = denominator.multiply(r.numerator);
        return num.compareTo(den);
    }
    public int intValue(){
        return (int) this.numerator.divide(this.denominator).longValue();
    }
    public long longValue(){
        return this.numerator.divide(this.denominator).longValue();
    }
    public float floatValue(){
        return (float) (this.numerator.doubleValue()/(this.denominator.doubleValue()));
    }
    public double doubleValue(){
        return (this.numerator.doubleValue()/(this.denominator.doubleValue()));
    }
    
    public BigInteger getNumerator() {
        return numerator;
    }
    public BigInteger getDenominator() {
        return denominator;
    }
    public Fraction add(Fraction r){
        if(denominator.equals(BigInteger.ZERO) || r.denominator.equals(BigInteger.ZERO)){
            return new Fraction(BigInteger.ZERO, BigInteger.ZERO);
        }
        BigInteger num = numerator.multiply(r.denominator).add(r.numerator.multiply(denominator));
        BigInteger den = denominator.multiply(r.denominator);
        return new Fraction(num, den).reduce();
    }
    public Fraction subtract(Fraction r){
        if(denominator.equals(BigInteger.ZERO) || r.denominator.equals(BigInteger.ZERO)){
            return new Fraction(BigInteger.ZERO, BigInteger.ZERO);
        }
        BigInteger num = numerator.multiply(r.denominator).subtract(r.numerator.multiply(denominator));
        BigInteger den = denominator.multiply(r.denominator);
        return new Fraction(num, den).reduce();
    }
    public Fraction multiply (Fraction r){
        if(denominator.equals(BigInteger.ZERO) || r.denominator.equals(BigInteger.ZERO)){
            return new Fraction(BigInteger.ZERO, BigInteger.ZERO);
        }
        BigInteger num = numerator.multiply(r.numerator);
        BigInteger den = denominator.multiply(r.denominator);
        return new Fraction(num, den).reduce();
    }
    public Fraction divide (Fraction r){
        if(denominator.equals(BigInteger.ZERO) || r.denominator.equals(BigInteger.ZERO)){
            return new Fraction(BigInteger.ZERO, BigInteger.ZERO);
        }
        BigInteger num = numerator.multiply(r.denominator);
        BigInteger den = denominator.multiply(r.numerator);
        return new Fraction(num, den).reduce();
    }
    public String toString(){
        return denominator.equals(BigInteger.ZERO)? "NaN": denominator.equals(BigInteger.ONE) ? numerator.toString() : numerator + "/" + denominator;
    }
    public boolean isInteger(){
        return denominator.equals(BigInteger.ONE);
    }
    private Fraction reduce(){
        BigInteger gcd = ggT(numerator, denominator);
        return new Fraction(numerator.divide(gcd), denominator.divide(gcd));

    }
    private static BigInteger ggT(BigInteger a, BigInteger b){
        a=a.signum()==-1?a.multiply(BigInteger.valueOf(-1)):a;
        b=b.signum()==-1?b.multiply(BigInteger.valueOf(-1)):b;
        return b.equals(BigInteger.ZERO)?a:ggT(b, a.mod(b));
    }
}
