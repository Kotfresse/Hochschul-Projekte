/**
 * @author Tri Nguyen
 **/
public class Triangle {
    public static void main(String[] args){
        int n = MyIO.readInt("Bitte gebe eine Zahl ein: ");
        triangle(n);
    }
    public static void triangle(int n){
        for(int i=n; i>0; i--){
            for(int j=0; j<i; j++){
                if(j==i-1){
                    System.out.print("*");
                    break;
                }
                System.out.print("* ");
            }
            System.out.println();
            for(int j=0; j<n-i+1; j++){
                System.out.print(" ");
            }
        }
    }
}
