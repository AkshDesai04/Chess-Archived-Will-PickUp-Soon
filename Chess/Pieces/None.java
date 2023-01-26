package Chess.Pieces;

public class None extends Piece {
	public None(int[] position) {
	value = 0;
	name = "None";
	this.position = position;
	code = "--";
}
	public boolean[][] possibleMoves(Piece[][] board, int[] position) {
		boolean[][] moves = new boolean[8][8];
		for(int i = 0;i < 8;i++)    for(int j = 0;j < 8;j++)    moves[i][j] = false;
		return moves;
	}
}
