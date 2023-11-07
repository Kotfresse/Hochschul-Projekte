/**
 * @author Tri Nguyen
 **/
public class Ggt {
    public static void main(String[] args) {
        int a,b;
        String x,y;
        while(true){
            x= MyIO.promptAndRead("Bitte geben Sie die erste Zahl ein: ");
            y= MyIO.promptAndRead("Bitte geben Sie die zweite Zahl ein: ");

            if(x=="a"||y=="b")
            {
                break;
            }
        try{
        a=Integer.parseInt(x);
        b=Integer.parseInt(y);
        }
        catch(NumberFormatException e){
            MyIO.writeln("Bitte geben Sie eine Zahl ein!");
            continue;
        }

       int ggt = ggt(a, b);
       MyIO.writeln("Der größte gemeinsame Teiler von " + a + " und " + b + " ist " + ggt);
       //Check if enter was pressed if yes break the loop
        }
        

    }
    /*public static int ggt(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        if (a == b) {
            return a;
        }
        if (a > b) {w
            return ggt(a - b, b);
        }
        return ggt(a, b - a);
    }*/
    public static int ggt(int a, int b){
        if (b == 0) {
            return a;
        }
        return ggt(b, a % b);
    }
}
