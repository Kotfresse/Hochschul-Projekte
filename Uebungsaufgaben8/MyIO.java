/**
 * @author Tri Nguyen, Leonard Winter
 **/
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.BigInteger;

public class MyIO {
    private static Scanner sc = new Scanner(System.in);
    private MyIO() {}

    public static String promptAndRead (String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }

    public static int readInt (String prompt) {
        System.out.print(prompt);
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            return -123; //This shouldn't matter, but fixes ASB's issue with the method. Does ASB input an unparsable string?
        }
    }
    public static long readLong (String prompt) {
        System.out.print(prompt);
        try {
            return Long.parseLong(sc.nextLine());
        } catch (Exception e) {
            return 0;
        }
    }    

    public static float readFloat (String prompt) {
        System.out.print(prompt);
        try {
            return Float.parseFloat(sc.nextLine());
        } catch (Exception e) {
            return 0;
        }
    }
    public static double readDouble (String prompt) {
        System.out.print(prompt);
        try {
            return Double.parseDouble(sc.nextLine());
        } catch (Exception e) {
            return 0;
        }
    }
    public static short readShort (String prompt) {
        System.out.print(prompt);
        try {
            return Short.parseShort(sc.nextLine());
        } catch (Exception e) {
            return 0;
        }
    }
    public static byte readByte (String prompt) {
        System.out.print(prompt);
        try {
            return Byte.parseByte(sc.nextLine());
        } catch (Exception e) {
            return 0;
        }
    }
    public static BigInteger readBigInteger (String prompt) {
        System.out.print(prompt);
        try {
            return new BigInteger(sc.nextLine());
        } catch (Exception e) {
            return null;
        }
    }
    public static BigDecimal readBigDecimal (String prompt) {
        System.out.print(prompt);
        try {
            return new BigDecimal(sc.nextLine());
        } catch (Exception e) {
            return null;
        }
    }
    public static void write(String s) {
        System.out.print(s);
    }

    public static void writeln (String s) {
        System.out.println(s);
    }
    public static void writelnReverse(String output){
        System.out.println(reverse(output));
    }
    public static void writeReverse(String output){
        System.out.print(reverse(output));
    }
    public static String reverse(String output) {
        return output.length() <= 1 ? output : reverse(output.substring(1)) + output.substring(0,1);
    }
    /*private static String promptAndRead(String prompt) {
        System.out.print(prompt);
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        return input;
    }
    private static int readInt(String Zahlt){
        System.out.print(Zahlt);
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
        return input;
    }*/
}