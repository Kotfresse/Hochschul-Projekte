/**
 * @author Tri Nguyen
 **/
import java.util.Scanner;
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