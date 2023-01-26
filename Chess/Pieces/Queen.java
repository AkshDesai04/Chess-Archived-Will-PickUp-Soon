package Chess.Pieces;

import javax.swing.*;

public class Queen extends Piece {
	public Queen(int color, int[] position) {
		value = 9;
		name = (color == 1 ? "White":"Black") + " Queen";
		code = (color == 1 ? "W":"B") + "Q";
		icon = new ImageIcon(filePath + (color == 1 ? "White":"Black") + "Queen.png");
		this.color = color;
		this.position = position;
	}
	public boolean[][] possibleMoves(Piece[][] board, int[] position) {
		boolean[][] moves = new boolean[8][8];
		for(int i = 0;i < 8;i++)    for(int j = 0;j < 8;j++)    moves[i][j] = false;

		//Queen's Rook Moves
		for(int i = 1;i < 8;i++)        //Up
			try {moves[position[0] - i][position[1]] = true;}
			catch (ArrayIndexOutOfBoundsException ignored) {}
		for(int i = 1;i < 8;i++)        //Down
			try {moves[position[0] + i][position[1]] = true;}
			catch (ArrayIndexOutOfBoundsException ignored) {}
		for(int i = 1;i < 8;i++)        //Left
			try {moves[position[0]][position[1] - i] = true;}
			catch (ArrayIndexOutOfBoundsException ignored) {}
		for(int i = 1;i < 8;i++)        //Right
			try {moves[position[0]][position[1] + i] = true;}
			catch (ArrayIndexOutOfBoundsException ignored) {}

		//Queen's Bishop Moves
		for(int i = 1;i < 8;i++)        //Bottom Right
			try {moves[position[0] + i][position[1] + i] = true;}
			catch (ArrayIndexOutOfBoundsException ignored) {}
		for(int i = 1;i < 8;i++)        //Bottom Left
			try {moves[position[0] + i][position[1] - i] = true;}
			catch (ArrayIndexOutOfBoundsException ignored) {}
		for(int i = 8;i > 0;i--)        //Top Right
			try {moves[position[0] - i][position[1] + i] = true;}
			catch (ArrayIndexOutOfBoundsException ignored) {}
		for(int i = 8;i > 0;i--)        //Top Left
			try {moves[position[0] - i][position[1] - i] = true;}
			catch (ArrayIndexOutOfBoundsException ignored) {}


		return moves;
	}
}
