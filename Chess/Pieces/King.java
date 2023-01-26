package Chess.Pieces;

import javax.swing.*;

public class King extends Piece {
	public King(int color, int[] position) {
		name = (color == 1 ? "White":"Black") + " King";
		code = (color == 1 ? "W":"B") + "K";
		icon = new ImageIcon(filePath + (color == 1 ? "White":"Black") + "King.png");
		this.color = color;
		this.position = position;
	}
	public boolean[][] possibleMoves(Piece[][] board, int[] position) {
		boolean[][] moves = new boolean[8][8];
		for(int i = 0;i < 8;i++)    for(int j = 0;j < 8;j++)    moves[i][j] = false;
		return moves;
	}
}
