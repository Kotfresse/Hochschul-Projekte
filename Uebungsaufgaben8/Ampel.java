/**
 * @author Leonard Winter, Tri Nguyen
 **/

public class Ampel {
    public static void main(String[] args) {
        int n = MyIO.readInt("Enter a number: ");
        String s = "";
        for(int i = 1;i<=n;i++) {
            if(i % 7 == 0 && i % 3 == 0 && i % 2 == 0) {
                s += "Ampel ";
            }else if((i % 2 == 0 && i % 3 == 0) || (i % 2 == 0 && i % 7 == 0) || (i % 3 == 0 && i % 7 == 0)){
                s += "Rot ";
            }else if(i % 2 == 0) {
                s += "Gelb ";
            }else if(i % 3 == 0) {
                s += "Grün ";
            }else if(i % 7 == 0) {
                s += "Blau ";
            }else {
                s += i+" ";
            }
        }
        System.out.println(s.substring(0, s.length()-1));
    }
}
