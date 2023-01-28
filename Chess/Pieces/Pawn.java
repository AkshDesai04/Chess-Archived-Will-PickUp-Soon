package Chess.Pieces;

import javax.swing.*;
import java.util.Objects;

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

		if(color == BLACK && Objects.equals(board[position[0] + 1][position[1]].code, "--")) {      //Black pawn moves
			moves[position[0] + 1][position[1]] = true;
			if(position[0] == 1 && Objects.equals(board[position[0] + 2][position[1]].code, "--"))
				moves[position[0] + 2][position[1]] = true;

			//Captures
			try {if (board[position[0] + 1][position[1] + 1].color == WHITE) moves[position[0] + 1][position[1] + 1] = true;}
			catch(ArrayIndexOutOfBoundsException ignored) {}
			try {if (board[position[0] + 1][position[1] - 1].color == WHITE) moves[position[0] + 1][position[1] - 1] = true;}
			catch(ArrayIndexOutOfBoundsException ignored) {}
		}

		if(color == WHITE && Objects.equals(board[position[0] - 1][position[1]].code, "--")) {      //White pawn moves
			moves[position[0] - 1][position[1]] = true;
			if(position[0] == 6 && Objects.equals(board[position[0] - 2][position[1]].code, "--"))
				moves[position[0] - 2][position[1]] = true;

			//Captures
			try {if (board[position[0] - 1][position[1] - 1].color == BLACK) moves[position[0] - 1][position[1] - 1] = true;}
			catch(ArrayIndexOutOfBoundsException ignored) {}
			try {if (board[position[0] - 1][position[1] + 1].color == BLACK) moves[position[0] - 1][position[1] + 1] = true;}
			catch(ArrayIndexOutOfBoundsException ignored) {}
		}

//		if(board[position[0] + color == 0?-1:1][position[1]].code == "--") {
//			moves[position[0] + color == 0?-1:1][position[1]] = true;
//			if(position[0] == 1 && board[position[0] + color == 0?-2:2][position[1]].code == "--")
//				moves[position[0]  + color == 0?-2:2][position[1]] = true;
//		}

		return moves;
	}
}
