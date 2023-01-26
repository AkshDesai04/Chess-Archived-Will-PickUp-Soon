package Chess.Pieces;

import Chess.BoardAndControls.Board;
import javax.swing.*;

public class Pawn extends Piece {
	public Pawn(int color, int[] position) {
		value = 1;
		name = (color == 1 ? "White":"Black") + " Pawn";
		code = (color == 1 ? "W":"B") + "P";
		icon = new ImageIcon(filePath + (color == 1 ? "White":"Black") + "Pawn.png");
		this.color = color;
		this.position = position;
	}
	public boolean[][] possibleMoves(Piece[][] board, int[] position) {
		boolean[][] moves = new boolean[8][8];
		for(int i = 0;i < 8;i++)    for(int j = 0;j < 8;j++)    moves[i][j] = false;

		if(color == 0 && board[position[0] + 1][position[1]].code == "--") {
			moves[position[0] + 1][position[1]] = true;
			if(position[0] == 1 && board[position[0] + 2][position[1]].code == "--")
				moves[position[0] + 2][position[1]] = true;
		}

		if(color == 1 && board[position[0] - 1][position[1]].code == "--") {
			moves[position[0] - 1][position[1]] = true;
			if(position[0] == 6 && board[position[0] - 2][position[1]].code == "--")
				moves[position[0] - 2][position[1]] = true;
		}

//		if(board[position[0] + color == 0?-1:1][position[1]].code == "--") {
//			moves[position[0] + color == 0?-1:1][position[1]] = true;
//			if(position[0] == 1 && board[position[0] + color == 0?-2:2][position[1]].code == "--")
//				moves[position[0]  + color == 0?-2:2][position[1]] = true;
//		}

		return moves;
	}
}
