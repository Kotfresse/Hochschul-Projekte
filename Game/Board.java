/**
 * @author Tri Nguyen, Richard Müller, Leonard Winter
 **/
public class Board {
    private static Fraction[][] board = new Fraction[8][8];// 0 bis 7
    private static String[][] g_board = new String[8][8];
    private static Player player = Player.White;
    private static Player player2 = Player.Black;
    private static boolean turn = true;

    public static void main(String[] args) {
        System.out.print("\033[2;1H");
        for (int i = 0; i < 22; i++) {
            System.out.print("\033[2K");
            System.out.print("\033[" + (i) + ";1H");
        }
        System.out.print("\033[2;1H");
        generateBoard();
        printBoard();
        while (true) {

            while (turn) {
                switch (System.console().readLine().toUpperCase()) {
                    case "N":
                        move(Direction.N, player);
                        break;
                    case "O":
                        move(Direction.O, player);
                        break;
                    case "S":
                        move(Direction.S, player);
                        break;
                    case "W":
                        move(Direction.W, player);
                        break;
                    case "NO":
                        move(Direction.NO, player);
                        break;
                    case "SW":
                        move(Direction.SW, player);
                        break;
                    case "STOP":
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Direction not found");
                        break;
                }
            }
            while (!turn) {
                switch (System.console().readLine().toUpperCase()) {
                    case "N":
                        move(Direction.N, player2);
                        break;
                    case "O":
                        move(Direction.O, player2);
                        break;
                    case "S":
                        move(Direction.S, player2);
                        break;
                    case "W":
                        move(Direction.W, player2);
                        break;
                    case "NO":
                        move(Direction.NO, player2);
                        break;
                    case "SW":
                        move(Direction.SW, player2);
                        break;
                    case "STOP":
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Direction not found");
                        break;
                }
            }
        }

    }

    public static void move(Direction D, Player p) {
        int[] position = playerPosition(p);
        int x = position[0];
        int y = position[1];

        switch (D) {
            case N:
                if (x == 0 || g_board[x - 1][y].toString().equals("W") || g_board[x - 1][y].toString().equals("B")) {
                    System.out.println("You can't move there");
                    System.console().readLine();
                } else {

                    g_board[x - 1][y] = g_board[x][y];
                    p.addScore((board[x - 1][y].multiply(board[x - 1][y]).doubleValue()));
                    g_board[x][y] = new Fraction(0, 1).toString();
                    board[x][y] = new Fraction(0, 1);
                    turn = !turn;
                }
                break;
            case S:
                if (x == 7 || g_board[x + 1][y].toString().equals("W") || g_board[x + 1][y].toString().equals("B")) {
                    System.out.println("You can't move there");
                    System.console().readLine();
                } else {

                    g_board[x + 1][y] = p.toString();
                    p.addScore((board[x + 1][y].multiply(board[x + 1][y]).doubleValue()));
                    g_board[x][y] = new Fraction(0, 1).toString();
                    board[x][y] = new Fraction(0, 1);
                    turn = !turn;
                }
                break;
            case O:
                if (y == 7 || g_board[x][y + 1].toString().equals("W") || g_board[x][y + 1].toString().equals("B")) {
                    System.out.println("You can't move there");
                    System.console().readLine();
                } else {

                    g_board[x][y + 1] = g_board[x][y];
                    p.addScore((board[x][y + 1].multiply(board[x][y + 1]).doubleValue()));
                    g_board[x][y] = new Fraction(0, 1).toString();
                    board[x][y] = new Fraction(0, 1);
                    turn = !turn;
                }
                break;
            case W:
                if (y == 0 || g_board[x][y - 1].toString().equals("W") || g_board[x][y - 1].toString().equals("B")) {
                    System.out.println("You can't move there");
                    System.console().readLine();
                } else {

                    g_board[x][y - 1] = g_board[x][y];
                    p.addScore((board[x][y - 1].multiply(board[x][y - 1]).doubleValue()));
                    g_board[x][y] = new Fraction(0, 1).toString();
                    board[x][y] = new Fraction(0, 1);
                    turn = !turn;
                }
                break;
            case NO:
                if (x == 7 || y == 7 || g_board[x + 1][y + 1].toString().equals("W")
                        || g_board[x + 1][y + 1].toString().equals("B")) {
                    System.out.println("You can't move there");
                    System.console().readLine();
                } else if (p == Player.White) {
                    System.out.println("Only Black can move that way");
                    System.console().readLine();
                } else {

                    g_board[x - 1][y + 1] = g_board[x][y];
                    p.addScore((board[x - 1][y + 1].multiply(board[x - 1][y + 1]).doubleValue()));
                    g_board[x][y] = new Fraction(0, 1).toString();
                    board[x][y] = new Fraction(0, 1);
                    turn = !turn;
                }
                break;
            case SW:
                if (x == 7 || y == 0 || g_board[x + 1][y - 1].toString().equals("W")
                        || g_board[x + 1][y - 1].toString().equals("B")) {
                    System.out.println("You can't move there");
                }
                if (p == Player.Black) {
                    System.out.println("Only White can move that way");
                    System.console().readLine();
                } else {

                    g_board[x - 1][y + 1] = g_board[x][y];
                    p.addScore((board[x - 1][y + 1].multiply(board[x - 1][y + 1]).doubleValue()));
                    g_board[x][y] = new Fraction(0, 1).toString();
                    board[x][y] = new Fraction(0, 1);
                    turn = !turn;
                }
                break;
            default:
                System.out.println("Direction not found");
                break;
        }
        actualizeBoard();
        printBoard();
        // System.out.println("Location"+x+" "+y);
    }

    public static int[] playerPosition(Player player) {
        int[] position = new int[2];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (g_board[i][j].toString().equals(player.toString())) {
                    position[0] = i;
                    position[1] = j;
                }
            }
        }
        return position;
    }

    public static void setBoard(int i, int j, Fraction fraction) {
        board[i][j] = fraction;
    }

    public static void generateBoard() {
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

    public static void printBoard() {
        for (int i = 0; i < 8; i++) {
            System.out.print("[ ");
            for (int j = 0; j < 8; j++) {
                int k = 7 - g_board[i][j].toString().length();
                for (int l = 0; l < k; l++) {
                    System.out.print(" ");
                }
                System.out.print("[" + g_board[i][j].toString() + "] ");
            }
            System.out.println("]");
            System.out.print("|");
            for (int o = 0; o < 81; o++) {
                System.out.print("-");
            }
            System.out.println("|");
        }
    }

    public static Fraction generateFraction() {
        // generates random number between 1 and 1000
        while (true) {
            int numerator = (int) (Math.random() * 999 + 1);
            int denominator = (int) (Math.random() * 999 + 1);
            if (new Fraction(numerator, denominator).doubleValue() < 2
                    && new Fraction(numerator, denominator).doubleValue() > 1
                    && new Fraction(numerator, denominator).getNumerator().intValue() > 9
                    && new Fraction(numerator, denominator).getDenominator().intValue() > 9) {
                return new Fraction(numerator, denominator);
            }
        }
    }

    public static void actualizeScore(Player p) {
        System.out.print(p.toString() + ": " + p.score());
    }

    public static void actualizeBoard() {
        for (int i = 2; i < 21; i++) {
            System.out.print("\033[2K");
            System.out.print("\033[" + (i) + ";1H");
            try {
                Thread.sleep(1); // Delay for better visualization
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // set the curser to the beginning of the line
        }
        System.out
                .println(player.toString() + ": " + player.score() + " " + player2.toString() + ": " + player2.score());
        if (turn) {
            System.out.println("White's turn");
        } else {
            System.out.println("Black's turn");
        }
        System.out.print("\033[2;1H");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (!(g_board[i][j].toString().equals("W") || g_board[i][j].toString().equals("B"))) {
                    g_board[i][j] = board[i][j].toString();
                }
            }
        }
        if (player.score() > 47) {
            System.out.println("White wins");
            System.out.flush();
            System.exit(0);
        }
        if (player2.score() > 47) {
            System.out.println("Black wins");
            System.out.flush();
            System.exit(0);
        }
        
    }
}