package Chess.Pieces;

public class Bishop extends Piece {

	public Bishop(int color, int x, int y) {
		value = 3;
		name = (color == 1 ? "White":"Black") + " Bishop";
		code = (color == 1 ? "W":"B") + "B";
		this.color = color;
		position = new int[]{x, y};
	}
	boolean[][] possibleMoves(String[][] board) {
		boolean[][] moves = new boolean[8][8];
		for(int i = 0;i < 8;i++)    for(int j = 0;j < 8;j++)    moves[i][j] = false;
		return moves;
	}
}
