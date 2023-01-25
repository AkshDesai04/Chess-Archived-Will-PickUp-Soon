package Chess.Pieces;

import java.io.File;

public class Pawn extends Piece {
	public Pawn(int color, int x, int y) {
		value = 1;
		name = (color == 1 ? "White":"Black") + " Pawn";
		code = (color == 1 ? "W":"B") + "P";
		image = new File(".C:\\Users\\akshd\\IdeaProjects\\Chess\\Chessassets\\" + (color == 1 ? "White":"Black") + "Pawn.svg");
		this.color = color;
		position = new int[]{x, y};
	}
	boolean[][] possibleMoves(String[][] board) {
		boolean[][] moves = new boolean[8][8];
		for(int i = 0;i < 8;i++)    for(int j = 0;j < 8;j++)    moves[i][j] = false;
		return moves;
	}
}
