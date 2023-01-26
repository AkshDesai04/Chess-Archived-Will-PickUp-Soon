package Chess.BoardAndControls;

import Chess.Pieces.*;

import java.awt.*;

public class Board {
	public static void initialiseBoard(Piece[][] board) {
		for(int i = 0;i < 8;i++)    for(int j = 0;j < 8;j++)    board[i][j] = new None(i, j);

		for(int i = 0;i < 8;i++)    board[6][i] = new Pawn(1, 6, i);     //White Pawns
		for(int i = 0;i < 8;i++)    board[1][i] = new Pawn(0, 1, i);     //Black Pawns

		board[0][0] = new Rook(0, 0, 0);         board[0][7] = new Rook(0, 0, 7);     //Black Rook
		board[7][0] = new Rook(1, 7, 0);         board[7][7] = new Rook(1, 7, 7);     //White Rook

		board[0][1] = new Knight(0, 0, 1);         board[0][6] = new Knight(0, 0, 6);     //Black Knight
		board[7][1] = new Knight(1, 7, 1);         board[7][6] = new Knight(1, 7, 6);     //White Knight

		board[0][2] = new Bishop(0, 0, 2);         board[0][5] = new Bishop(0, 0, 5);     //Black Bishop
		board[7][2] = new Bishop(1, 7, 2);         board[7][5] = new Bishop(1, 7, 5);     //White Bishop

		board[0][3] = new Queen(0, 0, 3);         board[0][4] = new King(0, 0, 4);     //Black Queen and King
		board[7][3] = new Queen(1, 7, 3);         board[7][4] = new King(1, 7, 4);     //White Queen and King
	}

	public static void printBoard(Piece[][] board) {
		for(int i = 0;i < 8;i++) {
			for (int j = 0; j < 8; j++)
				System.out.print(board[i][j].code + i + j + "\t");
			System.out.println();
		}
	}

	public static void showPossibleMoves(Piece[][] board, int[] position) {
		System.out.println("Called Board");
		boolean[][] possibleMove = board[position[0]][position[1]].possibleMoves(board, position);
		BoardGUI.cleanBoardColors();
		for(int i = 0;i < 8;i++) {
			for(int j = 0;j < 8;j++) {
				if(possibleMove[i][j]) {
					BoardGUI.spots[i][j].setBackground(Color.GREEN);
					System.out.println("Color");
				}
			}
		}
	}
}
