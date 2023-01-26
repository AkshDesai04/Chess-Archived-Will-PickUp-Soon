package Chess.BoardAndControls;

import Chess.Pieces.*;

import java.awt.*;

public class Board {
	public static void initialiseBoard(Piece[][] board) {
		final int WHITE = 1, BLACK = 0;

		for(int i = 0;i < 8;i++)    for(int j = 0;j < 8;j++)    board[i][j] = new None(new int[]{i, j});

		for(int i = 0;i < 8;i++)    board[6][i] = new Pawn(WHITE, new int[]{6, i});     //White Pawns
		for(int i = 0;i < 8;i++)    board[1][i] = new Pawn(BLACK, new int[]{1, i});     //Black Pawns

		board[0][0] = new Rook(BLACK, new int[]{0, 0});           board[0][7] = new Rook(BLACK, new int[]{0, 7});       //Black Rook
		board[7][0] = new Rook(WHITE, new int[]{7, 0});           board[7][7] = new Rook(WHITE, new int[]{7, 7});       //White Rook

		board[0][1] = new Knight(BLACK, new int[]{0, 1});         board[0][6] = new Knight(BLACK, new int[]{0, 6});     //Black Knight
		board[7][1] = new Knight(WHITE, new int[]{7, 1});         board[7][6] = new Knight(WHITE, new int[]{7, 6});     //White Knight

		board[0][2] = new Bishop(BLACK, new int[]{0, 2});         board[0][5] = new Bishop(BLACK, new int[]{0, 5});     //Black Bishop
		board[7][2] = new Bishop(WHITE, new int[]{7, 2});         board[7][5] = new Bishop(WHITE, new int[]{7, 5});     //White Bishop

		board[0][3] = new Queen(BLACK, new int[]{0, 3});          board[7][3] = new Queen(WHITE, new int[]{7, 3});      //Queens
		board[0][4] = new King(BLACK, new int[]{0, 4});           board[7][4] = new King(WHITE, new int[]{7, 4});       //Kings
	}

	public static void printBoard(Piece[][] board) {
		for(int i = 0;i < 8;i++) {
			for (int j = 0; j < 8; j++)
				System.out.print(board[i][j].code + "\t");
			System.out.println();
		}
	}

	public static void showPossibleMoves(Piece[][] board, int[] position) {
		boolean[][] possibleMove = board[position[0]][position[1]].possibleMoves(board, position);
		BoardGUI.cleanBoardColors();
		for(int i = 0;i < 8;i++) {
			for(int j = 0;j < 8;j++) {
				if(possibleMove[i][j]) {
					BoardGUI.spots[i][j].setBackground(Color.GREEN);
				}
			}
		}
	}
}
