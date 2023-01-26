package Chess.Pieces;

import javax.swing.*;
import java.io.File;

public class Queen extends Piece {
	public Queen(int color, int x, int y) {
		value = 9;
		name = (color == 1 ? "White":"Black") + " Queen";
		code = (color == 1 ? "W":"B") + "Q";
		icon = new ImageIcon(filePath + (color == 1 ? "White":"Black") + "Queen.png");
		this.color = color;
		position = new int[]{x, y};
	}
	boolean[][] possibleMoves(String[][] board) {
		boolean[][] moves = new boolean[8][8];
		for(int i = 0;i < 8;i++)    for(int j = 0;j < 8;j++)    moves[i][j] = false;
		return moves;
	}
}
