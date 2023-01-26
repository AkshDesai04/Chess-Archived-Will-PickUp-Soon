import Chess.BoardAndControls.Board;
import Chess.BoardAndControls.BoardGUI;
import Chess.Pieces.Piece;

import java.io.IOException;

public class Main {
	public static Piece[][] board;
	public static void main(String[] args) {
		board = new Piece[8][8];
		Board.initialiseBoard(board);
		Board.printBoard(board);

		try {
			BoardGUI.drawBoard(board);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
