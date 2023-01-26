package Chess.Pieces;

import java.io.File;

public class Knight extends Piece {
	public Knight (int color, int x, int y) {
		value = 3;
		name = (color == 1 ? "White":"Black") + " Knight";
		code = (color == 1 ? "W":"B") + "H";
		image = new File(".C:\\Users\\akshd\\IdeaProjects\\Chess\\Chessassets\\" + (color == 1 ? "White":"Black") + "Knight.svg");
		this.color = color;
		position = new int[]{x, y};
	}
	public boolean[][] possibleMoves(Piece[][] board, int[] position) {
		boolean[][] moves = new boolean[8][8];
		for(int i = 0;i < 8;i++)    for(int j = 0;j < 8;j++)    moves[i][j] = false;
		return moves;
	}
}
