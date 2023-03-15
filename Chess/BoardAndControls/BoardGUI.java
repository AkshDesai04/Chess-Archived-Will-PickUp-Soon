package Chess.BoardAndControls;

import Chess.Pieces.Piece;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

import static Chess.BoardAndControls.Board.*;
import static java.lang.Math.min;

public class BoardGUI {

	static JFrame frame;
	public static JButton[][] spots = new JButton[8][8];

	public static void drawBoard(Piece[][] board) throws IOException {
		Board b = new Board();
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		int dimensions = min(size.height, size.width);
		frame = new JFrame("Chess");

		drawPieces(board);

		cleanBoardColors();

		frame.setSize(dimensions*82/100, dimensions*85/100);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	public static void drawPieces(Piece[][] board) {
		System.out.println("Piece draw called.");
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		int dimensions = min(size.height, size.width);

		for(int i = 0;i < 8;i++) {
			for(int j = 0;j < 8;j++) {
				spots[i][j] = new JButton(board[i][j].icon);
//				spots[i][j] = new JButton("(" + board[i][j].position[0] + ", " + board[i][j].position[1] + ")");
				spots[i][j].setBounds(j*dimensions/10, i*dimensions/10, dimensions/10, dimensions/10);
				int finalI = i;
				int finalJ = j;

				spots[i][j].addActionListener(e -> {
					movePiece(board, new int[]{finalI, finalJ});
					printBoard(board);

				});

				frame.add(spots[i][j]);
			}
		}
	}

	public static void cleanBoardColors() {
		for(int i = 0;i < 8;i++)
			for(int j = 0;j < 8;j++)
				spots[i][j].setBackground((i+j)%2 == 0 ? Color.WHITE:Color.DARK_GRAY);
	}
}
