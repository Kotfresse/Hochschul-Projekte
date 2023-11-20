import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * @author Tri Nguyen
 **/
public class PalindromGenerator {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie Texte ein");
        String UserInput = sc.nextLine();
        System.out.println("Nochmal");
        String UserInput2 = sc.nextLine();
        sc.close();
        String[] UserInput3 = UserInput.split("\\s+");
        String[] UserInput4 = UserInput2.split("\\s+");
        if (UserInput3.length < UserInput4.length) {
            int i = 0;
            String cat = "";
            for (; i < UserInput3.length; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.println(palindromGenerator(UserInput3[i], UserInput4[i], j));
                    cat += palindromGenerator(UserInput3[i], UserInput4[i], j) + "\n ";
                }

            }
            for (; i < UserInput4.length; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.println(palindromGenerator(UserInput4[i], "", j));
                    cat += palindromGenerator(UserInput4[i], "", j) + "\n ";
                }
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter("palindrom.txt"));
            bw.write(cat);
            bw.close();

        }
        if (UserInput3.length > UserInput4.length) {
            int i = 0;
            String cat = "";
            for (; i < UserInput4.length; i++) {
                ;
                for (int j = 0; j < 5; j++) {
                    System.out.println(palindromGenerator(UserInput3[i], UserInput4[i], j));
                    cat += palindromGenerator(UserInput3[i], UserInput4[i], j) + (j==4?"": "\n");
                }
            }
            for (; i < UserInput3.length; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.println(palindromGenerator(UserInput3[i], "", j));
                    cat += palindromGenerator(UserInput3[i], "", j) + (j==4?"": "\n");
                }
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter("palindrom.txt"));
            bw.write(cat);
            bw.close();
        }
        if (UserInput3.length == UserInput4.length) {
            String cat = "";
            for (int i = 0; i < UserInput3.length; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.println(palindromGenerator(UserInput3[i], UserInput4[i], j));
                    cat += palindromGenerator(UserInput3[i], UserInput4[i], j) +(j==4?"": "\n");
                }
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter("palindrom.txt"));
            bw.write(cat);
            bw.close();
        }

    }

    public static String palindromGenerator(String s1, String s2, int index) {
        String original1 = s1.replaceAll("\\s+", "").toLowerCase();
        String original2 = s2.replaceAll("\\s+", "").toLowerCase();
        String reverse1 = new StringBuilder(original1).reverse().toString();
        String reverse2 = new StringBuilder(original2).reverse().toString();
        String zip = zip(original1, original2);
        String zipReverse = new StringBuilder(zip).reverse().toString();
        switch (index) {

            case 0:
                return original1 + original2 + reverse2 + reverse1;
            case 1:
                return original2 + original1 + reverse1 + reverse2;
            case 2:
                return reverse1 + reverse2 + original2 + original1;
            case 3:
                return reverse2 + reverse1 + original1 + original2;
            case 4:
                return zip + zipReverse;
            case 5:
                return zipReverse + zip;
            default:
                return "";
        }

    }

    public static String zip(String a, String b) {
        return a.length() == 0 && b.length() == 0 ? ""
                : a.length() == 0 && b.length() != 0 ? b
                        : a.length() != 0 && b.length() == 0 ? a
                                : a.substring(0, 1) + b.substring(0, 1) + zip(a.substring(1), b.substring(1));
    }
};