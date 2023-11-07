/**
 * @author Tri Nguyen
 **/
public class WordLcm {
    public static void main(String[] args){
        String[] input = new String[30];
        int[] input2 = new int[30];
        while(true){

            for(int i = 0; i < 30; i++){
                input[i] = MyIO.promptAndRead("Bitte gebe eine Zahl ein: ");
                if(input[i].equals("")){
                    MyIO.writeln("\n");
                    break;
                }
                //System.out.println(map(input[i]));
            }
            break;
            

        }
        for(int i = 0; i < 30; i++){
            if(input[i] != null){
                input2[i] = wordToInt(input[i]);
            }
        }
        //Aus allen Zahlen in der liste input2 den kleinsten gemeinsamen Vielfachen bilden
        int lcm = input2[0];
        for(int i = 1; i < input2.length; i++){
           if(input2[i] != 0){
                lcm = lcm(lcm, input2[i]);
           }
        }
        MyIO.writeln("Das größte gemeinsame Vielfache von deinen Nummern ist : "+lcm);

        
    }
    public static int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        return gcd(b % a, a);
    }
    public static int lcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0; 
        }
        return a * (b / gcd(a, b));
    }
    
    public static int wordToInt(String Zahl){
        switch(Zahl){
            case "null":
                return 0;
            case "eins":
                return 1;
            case "zwei":   
                return 2;
            case "drei":
                return 3;
            case "vier":
                return 4;
            case "fuenf":    
                return 5;
            case "sechs":  
                return 6;
            case "sieben":
                return 7;
            case "acht":
                return 8;
            case "neun":
                return 9;
            case "zehn":
                return 10;
            case "elf":
                return 11;
            case "zwoelf":
                return 12;
            case "dreizehn":
                return 13;
            case "vierzehn":
                return 14;
            case "fuenfzehn":
                return 15;
            case "sechzehn":
                return 16;
            case "siebzehn":
                return 17;
            case "achtzehn":
                return 18;
            case "neunzehn":
                return 19;
            case "zwanzig":
                return 20;
            case "einundzwanzig":
                return 21;
            case "zweiundzwanzig":
                return 22;
            case "dreiundzwanzig":
                return 23;
            case "vierundzwanzig":
                return 24;
            case "fuenfundzwanzig":
                return 25;
            case "sechsundzwanzig":
                return 26;
            case "siebenundzwanzig":
                return 27;
            case "achtundzwanzig":
                return 28;
            case "neunundzwanzig":
                return 29;
            case "dreißig":
                return 30;
            default:
                return -1;
        }
    }
}
