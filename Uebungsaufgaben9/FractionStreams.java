import java.util.Arrays;
/**
 * @author Tri Nguyen
 **/
public class FractionStreams {
    
    public static void main(String[] args) {
        //generate an array with all possible fractions that have to do with the numbers -11 to 13
        Fraction[] fractions = new Fraction[25*25];
        int counter = 0;
        for (int i = -11; i < 14; i++) {
            for (int j = -11; j < 14; j++) {    
                
                    fractions[counter] = new Fraction(i, j);
                    counter++;
            }
        }

        
       
        System.out.print("Hier werden alle Elemente sortiert, ohne Doppelte, als floats ausgegeben:");
        Arrays.stream(fractions).map(Fraction::floatValue).distinct().sorted().forEach(x-> MyIO.write(x.toString()+", "));
        System.out.println();
        System.out.print("Hier werden alle Elemente quadriert, ohne Doppelte, als Brüche ausgegeben:");
        Arrays.stream(fractions).map(x -> x.multiply(x)).distinct().forEach(x-> MyIO.write(x.toString()+", "));
        System.out.println();
        System.out.print("Hier werden alle Elemente in zufälliger Reihenfolge, bei denen Zähler und Nenner Primzahlen sind ausgegeben:");
        Arrays.stream(fractions).filter(x->x.getNumerator().isProbablePrime(1) && x.getDenominator().isProbablePrime(1)).forEach(x-> MyIO.write(x.toString()+", "));
        System.out.println();
        System.out.print("Hier werden alle Elemente sortiert, die ganze Zahlen (.isInteger()) dargestellt werden können, als Brüche ausgegeben:");
        Arrays.stream(fractions).filter(x->x.isInteger()).sorted().forEach(x-> MyIO.write(x.toString()+", "));
        System.out.println();
        System.out.print("Hier sind die sin-Werte aller Elemente, als double Werte, sortiert, ohne Doppelte ausgegeben:");
        Arrays.stream(fractions).map(x-> Math.sin(x.doubleValue())).distinct().sorted().forEach(x-> MyIO.write(x.toString()+", "));
        System.out.println();
        System.out.print("Hier werden alle Elemente, als invertierte Strings, ohne Doppelte, sortiert ausgegeben:");
        Arrays.stream(fractions).map(x->new StringBuilder(x.toString()).reverse().toString()).distinct().sorted().forEach(x-> MyIO.write(x.toString()+", "));



    }
}