package Chess.Pieces;

import java.io.File;

public abstract class Piece {
	int value; //Value of a piece.
	int color; //0 for black. 1 for white.
	public String code;
	String name;
	File image; //SVG File for the piece
	int[] position;
	abstract boolean[][] possibleMoves(String[][] board);
}
