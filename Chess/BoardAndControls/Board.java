package Chess.BoardAndControls;

import Chess.Pieces.*;
import Main.Main;

import javax.swing.*;
import java.awt.*;

import static Chess.BoardAndControls.BoardGUI.drawPieces;
import static javax.swing.text.StyleConstants.setIcon;





import Chess.Pieces.Piece;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

import static Chess.BoardAndControls.Board.*;
import static java.lang.Math.min;







public class Board {
	static final int WHITE = 1, BLACK = 0;
	static int chance = WHITE;
	static int[] piece_in_focus_position = new int[] {-1, -1};

	public static void initialiseBoard(Piece[][] board) {

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
		board[0][4] = new King(BLACK, new int[]{0, 4});//           board[7][4] = new King(WHITE, new int[]{7, 4});       //Kings

		board[4][4] = new Rook(WHITE, new int[]{4 ,4});
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

	public static boolean movePiece(Piece[][] board, Piece piece, int[] destination) {
		System.out.println("Trying to move a piece");
		if(piece.possibleMoves(board, piece.position)[destination[0]][destination[1]] == true) {
			System.out.println("Inside if");
			switch(piece.code.charAt(1)) {
				case 'R':
					Main.board[destination[0]][destination[1]] = new Rook(piece.color, destination);
				break;
				case 'N':
					Main.board[destination[0]][destination[1]] = new Knight(piece.color, destination);
				break;
				case 'B':
					Main.board[destination[0]][destination[1]] = new Bishop(piece.color, destination);
				break;
				case 'K':
					Main.board[destination[0]][destination[1]] = new King(piece.color, destination);
				break;
				case 'Q':
					Main.board[destination[0]][destination[1]] = new Queen(piece.color, destination);
				break;
				case 'P':
					Main.board[destination[0]][destination[1]] = new Pawn(piece.color, destination);
				break;
				case '-':
					Main.board[destination[0]][destination[1]] = new None(destination);
				break;
			}
			board[piece.position[0]][piece.position[1]] = new None(new int[] {piece.position[0], piece.position[1]});
			System.out.println("Testing: " + piece.code.charAt(1));
			System.out.println("Moved piece\n\n\n");
			printBoard(board);
			return true;
		}
		else {
			System.out.println("else coz: " + piece.possibleMoves(board, piece.position)[destination[0]][destination[1]]);
			System.out.println("possible moves: ");
			for(int i = 0;i < 7;i++) {
				for (int j = 0; j < 8; j++)
					System.out.print(piece.possibleMoves(board, piece.position)[i][j] ? "✅" : "❌");
				System.out.println();
			}
		}

		System.out.println("\n\n\n\n\n");

		return false;
	}

	public static void movePiece(Piece[][] board, int[] position) {
		Main.board[position[0]][position[1]] = new Rook(WHITE, position);
		drawPieces(Main.board);
	}
}
