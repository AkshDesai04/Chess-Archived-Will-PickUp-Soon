package Chess.Pieces;

public class None extends Piece {
	public None(int x, int y) {
	value = 0;
	name = "None";
	position = new int[]{x, y};
	code = "--";
}
	boolean[][] possibleMoves(String[][] board) {
		boolean[][] moves = new boolean[8][8];
		for(int i = 0;i < 8;i++)    for(int j = 0;j < 8;j++)    moves[i][j] = false;
		return moves;
	}
}
