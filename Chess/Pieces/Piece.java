package Chess.Pieces;

import java.io.File;

public abstract class Piece {
	int value; //Value of a piece.
	int color; //0 for black. 1 for white.
	public String code;
	String name;
	public File image; //SVG File for the piece
	int[] position;
	public abstract boolean[][] possibleMoves(Piece[][] board, int[] position);
}
