package Chess.BoardAndControls;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import Chess.Pieces.*;

import static java.lang.Math.min;

public class BoardGUI {

	public static JButton[][] spots = new JButton[8][8];

	public static void drawBoard(Piece[][] board) throws IOException {
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		int dimensions = min(size.height, size.width);
		JFrame frame = new JFrame("Chess");

		for(int i = 0;i < 8;i++) {
			for(int j = 0;j < 8;j++) {
				spots[i][j] = new JButton(board[i][j].icon);      //TODO: why the flip?
				spots[i][j].setBounds(j*dimensions/10, i*dimensions/10, dimensions/10, dimensions/10);
				int finalI = i;
				int finalJ = j;
				spots[i][j].addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("Piece: " + board[finalI][finalJ].name + "\ni = " + finalI + "\nj = " + finalJ);
					}
				});
				frame.add(spots[i][j]);
			}
		}

		cleanBoardColors();

		frame.setSize(dimensions*82/100, dimensions*85/100);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	public static void cleanBoardColors() {
		for(int i = 0;i < 8;i++)
			for(int j = 0;j < 8;j++)
				spots[i][j].setBackground((i+j)%2 == 0 ? Color.WHITE:Color.DARK_GRAY);
	}
}
