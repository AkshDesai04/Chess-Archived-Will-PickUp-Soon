package Chess.Pieces;

import javax.swing.*;

public class Rook extends Piece {
	public Rook(int color, int[] position) {
		value = 5;
		name = (color == 1 ? "White":"Black") + " Rook";
		code = (color == 1 ? "W":"B") + "R";
		code = (color == 1 ? "W":"B") + "R";
		icon = new ImageIcon(filePath + (color == 1 ? "White":"Black") + "Rook.png");
		this.color = color;
		this.position = position;
	}
	public boolean[][] possibleMoves(Piece[][] board, int[] position) {
		boolean[][] moves = new boolean[8][8];
		for(int i = 0;i < 8;i++)    for(int j = 0;j < 8;j++)    moves[i][j] = false;

		for(int i = 1;i < 8;i++)        //Up
			try {
				if(board[position[0] - i][position[1]].color == color)      break;
				if(board[position[0] - i][position[1]].color != color && board[position[0] - i][position[1]].color != -1) {     moves[position[0] - i][position[1]] = true;     break;}
				moves[position[0] - i][position[1]] = true;
			}
			catch (ArrayIndexOutOfBoundsException ignored) {}
		for(int i = 1;i < 8;i++)        //Down
			try {
				if(board[position[0] + i][position[1]].color == color)      break;
				if(board[position[0] + i][position[1]].color != color && board[position[0] + i][position[1]].color != -1) {     moves[position[0] + i][position[1]] = true;     break;}
				moves[position[0] + i][position[1]] = true;
			}
			catch (ArrayIndexOutOfBoundsException ignored) {}
		for(int i = 1;i < 8;i++)        //Left
			try {
				if(board[position[0]][position[1] - i].color == color)      break;
				if(board[position[0]][position[1] - i].color != color && board[position[0]][position[1] - i].color != -1) {     moves[position[0]][position[1] - i] = true;     break;}
				moves[position[0]][position[1] - i] = true;
			}
			catch (ArrayIndexOutOfBoundsException ignored) {}
		for(int i = 1;i < 8;i++)        //Right
			try {
				if(board[position[0]][position[1] + i].color == color)      break;
				if(board[position[0]][position[1] + i].color != color && board[position[0]][position[1] + i].color != -1) {     moves[position[0]][position[1] + i] = true;     break;}
				moves[position[0]][position[1] + i] = true;
			}
			catch (ArrayIndexOutOfBoundsException ignored) {}

		return moves;
	}
}
