/**
 * @author Tri Nguyen
 **/
import java.math.BigInteger;
final public class Fraction extends Number implements Comparable<Fraction>{
    private BigInteger numerator, denominator;
    //Keep in mind that the Fraction itself gets changed when you do operations on it or not
    public static void main(String[] args) {
        /*
         Fraction Alex = new Fraction(1,2);
         Fraction Flaucher = new Fraction("6", "3");
         Fraction Helen = new Fraction(BigInteger.valueOf(3), BigInteger.valueOf(2));
         Fraction Lennard = new Fraction(2, 1);
         System.out.println(Alex.toString());
         System.out.println(Flaucher.toString());
         System.out.println(Helen.toString());
         System.out.println(Alex.add(Flaucher));
         System.out.println(MyMath.gcd(BigInteger.valueOf(2), BigInteger.valueOf(2)));
         if(Flaucher.isInteger()){
             System.out.println("Flaucher is an integer");
         }else{
             System.out.println("Flaucher is not an integer");
         }
         
         if(Helen.isInteger()){
             System.out.println("Helen is an integer");
         }else{
             System.out.println("Helen is not an integer");
         }
         System.out.println(Helen);
         System.out.println(Lennard);
         System.out.println(Helen.multiply(Lennard));
         if(Helen.multiply(Lennard).isInteger()){
             System.out.println("Helen*Lennard is an integer");
         }else{
             System.out.println("Helen*Lennard is not an integer");
         }
         Fraction neu= new Fraction(17, 91);
         Fraction b = new Fraction(8, 1);
         Fraction h = new Fraction(136, 91);
         System.out.println(MyMath.gcd(h.getNumerator(), h.getDenominator()));
         System.out.println(neu.multiply(b));
         Fraction f= new Fraction(new BigInteger("-4"),new BigInteger("6"));
         Fraction g= new Fraction(new BigInteger("4"),new BigInteger("-6"));
         System.out.println(f);
         System.out.println(g);
         System.out.println(f.add(g));
         */
    }
    //private Fraction(){} // private constructor
    public Fraction(long numerator, long denominator) {
        this.numerator = BigInteger.valueOf(numerator);
        this.denominator = BigInteger.valueOf(denominator);
        this.numerator=this.numerator.divide(ggT(this.numerator, this.denominator));
        this.denominator=this.denominator.divide(ggT(this.numerator, this.denominator));
        if(this.denominator.signum()==-1){
            this.numerator=this.numerator.multiply(BigInteger.valueOf(-1));
            this.denominator=this.denominator.multiply(BigInteger.valueOf(-1));
        }

    }
    public Fraction(BigInteger numerator, BigInteger denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        this.numerator=this.numerator.divide(ggT(numerator, denominator));
        this.denominator=this.denominator.divide(ggT(numerator, denominator));
        if(this.denominator.signum()==-1){
            this.numerator=this.numerator.multiply(BigInteger.valueOf(-1));
            this.denominator=this.denominator.multiply(BigInteger.valueOf(-1));
        }
    }
    public Fraction(String numerator, String denominator) {
        this.numerator = new BigInteger(numerator);
        this.denominator = new BigInteger(denominator);
        this.numerator=this.numerator.divide(ggT(this.numerator, this.denominator));
        this.denominator=this.denominator.divide(ggT(this.numerator, this.denominator));
        if(this.denominator.signum()==-1){
            this.numerator=this.numerator.multiply(BigInteger.valueOf(-1));
            this.denominator=this.denominator.multiply(BigInteger.valueOf(-1));
        }
        
    }
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
        return (float) this.numerator.divide(this.denominator).doubleValue();
    }
    public double doubleValue(){
        return this.numerator.divide(this.denominator).doubleValue();
    }
    
    public BigInteger getNumerator() {
        return numerator;
    }
    public BigInteger getDenominator() {
        return denominator;
    }
    public Fraction add(Fraction r){
        BigInteger num = numerator.multiply(r.denominator).add(r.numerator.multiply(denominator));
        BigInteger den = denominator.multiply(r.denominator);
        return new Fraction(num, den).reduce();
    }
    public Fraction subtract(Fraction r){
        BigInteger num = numerator.multiply(r.denominator).subtract(r.numerator.multiply(denominator));
        BigInteger den = denominator.multiply(r.denominator);
        return new Fraction(num, den).reduce();
    }
    public Fraction multiply (Fraction r){
        BigInteger num = numerator.multiply(r.numerator);
        BigInteger den = denominator.multiply(r.denominator);
        return new Fraction(num, den).reduce();
    }
    public Fraction divide (Fraction r){
        BigInteger num = numerator.multiply(r.denominator);
        BigInteger den = denominator.multiply(r.numerator);
        return new Fraction(num, den).reduce();
    }
    public String toString(){
        return denominator.equals(BigInteger.ONE) ? numerator.toString() : numerator + "/" + denominator;
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
