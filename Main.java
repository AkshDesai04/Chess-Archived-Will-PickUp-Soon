import Chess.BoardAndControls.Board;
import Chess.Pieces.Piece;

public class Main {
	public static Piece[][] board;
	public static void main(String[] args) {
		board = new Piece[8][8];
		Board.initialiseBoard(board);
		Board.printBoard(board);
	}
}
