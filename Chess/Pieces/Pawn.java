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
	public boolean[][] possibleMoves(Piece[][] board, int[] position) {
		System.out.println("Called Pawn");
		boolean[][] moves = new boolean[8][8];
		for(int i = 0;i < 8;i++)    for(int j = 0;j < 8;j++)    moves[i][j] = false;

		if(color == 0) {
			moves[position[0]][position[1]+1] = true;
			if(position[0] == 1)
				moves[position[0]][position[1]+2] = true;
		}
		return moves;
	}
}
