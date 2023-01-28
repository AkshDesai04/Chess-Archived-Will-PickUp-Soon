package Chess.Pieces;

import javax.swing.*;

public class Knight extends Piece {
	public Knight (int color, int[] position) {
		value = 3;
		name = (color == 1 ? "White":"Black") + " Knight";
		code = (color == 1 ? "W":"B") + "H";
		icon = new ImageIcon(filePath + (color == 1 ? "White":"Black") + "Knight.png");
		this.color = color;
		this.position = position;
	}
	public boolean[][] possibleMoves(Piece[][] board, int[] position) {
		boolean[][] moves = new boolean[8][8];
		for(int i = 0;i < 8;i++)    for(int j = 0;j < 8;j++)    moves[i][j] = false;

		try {if(board[position[0] + 2][position[1] + 1].color != color)		moves[position[0] + 2][position[1] + 1] = true;}	catch(ArrayIndexOutOfBoundsException ignored) {}
		try {if(board[position[0] + 2][position[1] - 1].color != color)		moves[position[0] + 2][position[1] - 1] = true;}	catch(ArrayIndexOutOfBoundsException ignored) {}
		try {if(board[position[0] - 2][position[1] + 1].color != color)		moves[position[0] - 2][position[1] + 1] = true;}	catch(ArrayIndexOutOfBoundsException ignored) {}
		try {if(board[position[0] - 2][position[1] - 1].color != color)		moves[position[0] - 2][position[1] - 1] = true;}	catch(ArrayIndexOutOfBoundsException ignored) {}
		try {if(board[position[0] + 1][position[1] + 2].color != color)		moves[position[0] + 1][position[1] + 2] = true;}	catch(ArrayIndexOutOfBoundsException ignored) {}
		try {if(board[position[0] + 1][position[1] - 2].color != color)		moves[position[0] + 1][position[1] - 2] = true;}	catch(ArrayIndexOutOfBoundsException ignored) {}
		try {if(board[position[0] - 1][position[1] + 2].color != color)		moves[position[0] - 1][position[1] + 2] = true;}	catch(ArrayIndexOutOfBoundsException ignored) {}
		try {if(board[position[0] - 1][position[1] - 2].color != color)		moves[position[0] - 1][position[1] - 2] = true;}	catch(ArrayIndexOutOfBoundsException ignored) {}

		return moves;
	}
}
