import java.math.BigInteger;
/**
 * @author Tri Nguyen
 **/
public class Kgv {
    public static void main(String[] args){ 
        BigInteger a = new BigInteger(MyIO.readBigDecimal("Bitte gebe eine Zahl ein: ").toString());
        BigInteger b = new BigInteger(MyIO.readBigDecimal("Bitte gebe eine Zahl ein: ").toString());
        System.out.println("Das kgv ist: "+kgv(a,b));
    }

    public static BigInteger kgv(BigInteger a, BigInteger b){
       return a.multiply(b).divide(a.gcd(b));
    }
}


