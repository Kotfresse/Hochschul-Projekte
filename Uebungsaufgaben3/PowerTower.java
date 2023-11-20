/**
 * @author Tri Nguyen
 **/
import java.lang.Math;
import java.math.BigDecimal;
public class PowerTower {
    public static void main(String[] args) {
        double a = MyIO.readDouble("Bitte geben Sie eine Double ein: ");
        int b = MyIO.readInt("Bitte geben Sie eine ganze Zahl ein: ");
        double power = powerTower(a, b);
        BigDecimal Bigpower = powerTower(BigDecimal.valueOf(a), b);
        MyIO.writeln("Die Potenz von " + a + " hoch " + b + " ist " + power+" ");
        MyIO.writeln("Die Potenz von " + a + " hoch " + b + " ist " + Bigpower+" ");
        power = powerTower(0.25,225);
        MyIO.writeln("Die Potenz von 0.25 hoch 225 ist " + power+" ");
        power = powerTower(1.4142,144);
        MyIO.writeln("Die Potenz von 1.4142 hoch 144 ist " + power+" ");
        power = powerTower(0.3333,300);

        
        
    }
    public static double powerTower(double a, int b) {
        if (b == 0) {
            return 1;
        }
        return Math.pow(a,powerTower(a, b - 1));
    }
    public static BigDecimal powerTower(BigDecimal a, int b) {
        if (b == 0) {
            return BigDecimal.ONE;
        }
        return a.pow(powerTower(a, b - 1).intValue());
    }
}
