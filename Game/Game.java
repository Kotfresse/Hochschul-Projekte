public class Game {
    enum State{
        PLAYER1, PLAYER2;
    }
    
    private static Board b_board = new Board();
    private static Player player = Player.White ;
    private static Player player2 = Player.Black;

    public static void main(String[] args) {
        b_board.generateBoard();
        b_board.printBoard();

    }
    
    
}
