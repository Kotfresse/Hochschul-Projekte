/**
 * @author Tri Nguyen
 **/
import java.util.Scanner;
import java.math.BigInteger;
import java.math.BigDecimal;
public class MyIO {
    private MyIO() {}
    static Scanner sc = new Scanner(System.in);

    public static String promptAndRead(String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }
    public static int readInt(String prompt) {
        System.out.print(prompt);
        return sc.nextInt();
    }
    public static double readDouble(String prompt) {
        System.out.print(prompt);
        return sc.nextDouble();
    }
    public static long readLong(String prompt) {
        System.out.print(prompt);
        return sc.nextLong();
    }
    public static float readFloat(String prompt) {
        System.out.print(prompt);
        return sc.nextFloat();
    }
    public static BigInteger readBigInteger(String prompt) {
        System.out.print(prompt);
        return sc.nextBigInteger();
    }
    public static BigDecimal readBigDecimal(String prompt) {
        System.out.print(prompt);
        return sc.nextBigDecimal();
    }
    public static void write (String[] output) {
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i]);
        }
    }
    public static void write (String output) {
        System.out.print(output);
    }
    public static void writeln (String output) {
        System.out.println(output);
    }
    public static void writeln (int output) {
        System.out.println(output);
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