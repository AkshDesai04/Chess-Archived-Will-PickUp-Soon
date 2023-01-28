package Chess.Pieces;

import javax.swing.*;

public abstract class Piece {
	int WHITE = 1, BLACK = 0;
	int value; //Value of a piece.
	int color; //0 for black. 1 for white.
	public String code;
	public String name;
	public static final String filePath = "C:\\Users\\akshd\\IdeaProjects\\Chess\\Chess\\assets\\";
	public Icon icon;
	public int[] position;
	public abstract boolean[][] possibleMoves(Piece[][] board, int[] position);
}
