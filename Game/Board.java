public class Board{
    private static Fraction[][] board = new Fraction[8][8];//0 bis 7
    public static void main(String[] args) {
        generateBoard();
        printBoard();
    }
    public Board(){

    }
    public static void generateBoard(){
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                board[i][j] = generateFraction();
            }
        }
    }
    public static void printBoard(){
        for(int i = 0; i < 8; i++){
            System.out.print("[");
            for(int j = 0; j < 8; j++){
                int k=7- board[i][j].toString().length();
                for(int l=0;l<k;l++){
                    System.out.print(" ");
                }
                System.out.print("["+board[i][j].toString()+"] ");
            }
            System.out.println("]");
            System.out.print("|");
            for(int o = 0; o < 80; o++){
                System.out.print("-");
            }
            System.out.println("|");
        }
    }
    public static Fraction generateFraction(){
        //generate random number between 1 and 1000
        while(true){
            int numerator = (int)(Math.random() * 1000 + 1);
            int denominator = (int)(Math.random() * 1000 + 1);
            if(new Fraction(numerator, denominator).doubleValue()<2 && new Fraction(numerator, denominator).doubleValue()>1&& new Fraction(numerator, denominator).getNumerator().intValue()>9 && new Fraction(numerator, denominator).getDenominator().intValue()>9){
                return new Fraction(numerator, denominator);
            }
        }
    }
}