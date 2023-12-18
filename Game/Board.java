

public class Board {
    private static Fraction[][] board = new Fraction[8][8];// 0 bis 7
    private static String[][] g_board = new String[8][8];
    private static Player player = Player.White ;
    private static Player player2 = Player.Black;

    public static void main(String[] args) {
        generateBoard();
        printBoard();
        while(true){
            switch (System.console().readLine()) {
                case "N":
                    move(Direction.N, player);
                    break;
                case "O":
                    move(Direction.O,player);
                case "S":
                    move(Direction.S,player);
                case "W":
                    move(Direction.W,player);
                default:
                    break;
            }
        }

    }

    public Board() {
    }
    public static void move(Direction D, Player p){
        int[] position = playerPosition(p);
        int x = position[0];
        int y = position[1];
        if(D==Direction.N){
            if(x==0){
                System.out.println("You can't move there");
            }else{
                if(board[x-1][y].toString().equals("0")){
                    System.out.println("You can't move there");
                }else{
                    g_board[x-1][y]=g_board[x][y];
                    g_board[x][y]=new Fraction(0,1).toString();
                    board[x][y]=new Fraction(0,1);
                }
            }
        }else if(D==Direction.S){
            if(x==7){
                System.out.println("You can't move there");
            }else{
                if(board[x+1][y].toString().equals("0")){
                    System.out.println("You can't move there");
                }else{
                    g_board[x+1][y]=g_board[x][y];
                    board[x][y]=new Fraction(0,1);
                }
            }
        }else if(D==Direction.O){
            if(y==0){
                System.out.println("You can't move there");
            }else{
                if(board[x][y-1].toString().equals("0")){
                    System.out.println("You can't move there");
                }else{
                    g_board[x][y-1]=g_board[x][y];
                    board[x][y]=new Fraction(0,1);
                }
            }
        }else if(D==Direction.W){
            if(y==7){
                System.out.println("You can't move there");
            }else{
                if(board[x][y+1].toString().equals("0")){
                    System.out.println("You can't move there");
                }else{
                    g_board[x][y+1]=g_board[x][y];
                    board[x][y]=new Fraction(0,1);
                }
            }
        }else if(D==Direction.NO&&p==Player.Black){
            if(x==0||y==0){
                System.out.println("You can't move there");
            }else{
                if(board[x-1][y-1].toString().equals("0")){
                    System.out.println("You can't move there");
                }else{
                    g_board[x-1][y-1]=g_board[x][y];
                    board[x][y]=new Fraction(0,1);
                }
            }
        }else if(D==Direction.SW&&p==Player.Black){
            if(x==7||y==7){
                System.out.println("You can't move there");
            }else{
                if(board[x+1][y+1].toString().equals("0")){
                    System.out.println("You can't move there");
                }else{
                    g_board[x+1][y+1]=g_board[x][y];
                    board[x][y]=new Fraction(0,1);
                }
            }
        }
        actualizeBoard();
        printBoard();
    }
    public static int[] playerPosition(Player player){
        int[] position = new int[2];
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(g_board[i][j].toString().equals(player.toString())){
                    position[0]=i;
                    position[1]=j;
                }
            }
        }
        return position;
    }
    public static void setBoard(int i, int j, Fraction fraction) {
        board[i][j] = fraction;
    }
    public static void generateBoard(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i == 3 && j == 3 || i == 4 && j == 4) {
                    board[i][j] = new Fraction(0, 1);
                } else {
                    board[i][j] = generateFraction();
                }
            }
        }
         for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i == 3 && j == 3 || i == 4 && j == 4) {
                    g_board[i][j] = board[i][j].toString();
                } else {
                    g_board[i][j] = board[i][j].toString();
                }
            }
        }
        g_board[3][3] = player2.toString();
        g_board[4][4] = player.toString();
        
    }
    public static void printBoard(){
        for(int i = 0; i < 8; i++){
            System.out.print("[ ");
            for(int j = 0; j < 8; j++){
                int k=7- g_board[i][j].toString().length();
                for(int l=0;l<k;l++){
                    System.out.print(" ");
                }
                System.out.print("["+g_board[i][j].toString()+"] ");
            }
            System.out.println("]");
            System.out.print("|");
            for(int o = 0; o < 81; o++){
                System.out.print("-");
            }
            System.out.println("|");
        }
    }

    /*public static void generateBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i == 3 && j == 3 || i == 4 && j == 4) {
                    board[i][j] = new Fraction(0, 1);
                } else {
                    board[i][j] = generateFraction();
                }
            }
        }
    }*/

    /*public Fraction getBoard(int i, int j) {
        return board[i][j];
    }*/

    /*public static void printBoard() {
        for (int i = 0; i < 8; i++) {
            System.out.print("[ ");
            for (int j = 0; j < 8; j++) {
                int k = 7 - board[i][j].toString().length();
                for (int l = 0; l < k; l++) {
                    System.out.print(" ");
                }
                System.out.print("[" + board[i][j].toString() + "] ");
            }
            System.out.println("]");
            System.out.print("|");
            for (int o = 0; o < 81; o++) {
                System.out.print("-");
            }
            System.out.println("|");
        }
    }*/

    public static Fraction generateFraction() {
        // generate random number between 1 and 1000
        while (true) {
            int numerator = (int) (Math.random() * 1000 + 1);
            int denominator = (int) (Math.random() * 1000 + 1);
            if (new Fraction(numerator, denominator).doubleValue() < 2
                    && new Fraction(numerator, denominator).doubleValue() > 1
                    && new Fraction(numerator, denominator).getNumerator().intValue() > 9
                    && new Fraction(numerator, denominator).getDenominator().intValue() > 9) {
                return new Fraction(numerator, denominator);
            }
        }
    }

    public static void actualizeBoard() {
        for (int i = 2; i < 20; i++) {
            System.out.print("\033[2K");
            System.out.print("\033[" + (i) + ";1H");
            try {
                Thread.sleep(5); // Delay for better visualization
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // set the curser to the beginning of the line
        }
        System.out.print("\033[2;1H");
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(!(g_board[i][j].toString().equals("W")||g_board[i][j].toString().equals("B"))){
                    g_board[i][j]=board[i][j].toString();
                }
            }
        }
    }
}