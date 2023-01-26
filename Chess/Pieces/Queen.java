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
		return moves;
	}
}
