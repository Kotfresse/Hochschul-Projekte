import java.util.Scanner;

/**
 * @author Tri Nguyen
 **/
public class PalindromTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie ein Wort ein");
        String UserInput = sc.nextLine();
        if (UserInput == null) {
            System.out.println("Bitte geben Sie ein Wort ein");
            UserInput = sc.nextLine();
        }
        sc.close();
        // String[] palindroms = {"anna", "otto", "lagerregal", "reliefpfeiler",
        // "rentner", "eibob", "ein nasser bassen nie"};
        if (palindromTest(UserInput)) {
            System.out.println(UserInput + " ist ein Palindrom: True ");
        } else {
            System.out.println(UserInput + " ist kein Palindrom: False ");
        }
        /*
         * for(int i=0; i < palindroms.length; i++){
         * if(palindromTest(palindroms[i])){
         * System.out.println(palindroms[i]+" ist ein Palindrom");
         * }
         * else{
         * System.out.println(palindroms[i]+" ist kein Palindrom");
         * }
         * }
         */
    }

    public static boolean palindromTest(String s) {
        String s1 = s.replaceAll("\\s+", "").toLowerCase();
        String s2 = new StringBuilder(s1).reverse().toString();
        return s1.equals(s2);
    }
}
