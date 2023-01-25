package Chess;

import Chess.Pieces.Piece;
public class Board {
	public static void initialiseBoard(Piece[][] board) {
		for(int i = 0;i < 8;i++)    for(int j = 0;j < 8;j++)    board[i][j] = "-";

		for(int i = 0;i < 8;i++)    board[6][i] = "WP";     //White Pawns
		for(int i = 0;i < 8;i++)    board[1][i] = "BP";     //Black Pawns

		board[0][0] = "BR";         board[0][7] = "BR";     //Black Rook
		board[7][0] = "WR";         board[7][7] = "WR";     //White Rook

		board[0][1] = "BH";         board[0][6] = "BH";     //Black Knight
		board[7][1] = "WH";         board[7][6] = "WH";     //White Knight

		board[0][2] = "BB";         board[0][5] = "BB";     //Black Bishop
		board[7][2] = "WB";         board[7][5] = "WB";     //White Bishop

		board[0][3] = "BQ";         board[0][4] = "BK";     //Black Queen and King
		board[7][3] = "WQ";         board[7][4] = "WK";     //White Queen and King
	}

	public static void printBoard(Piece[][] board) {
		for(int i = 0;i < 8;i++) {
			for (int j = 0; j < 8; j++)
				System.out.print(board[i][j] + "\t");
			System.out.println();
		}
	}
}
