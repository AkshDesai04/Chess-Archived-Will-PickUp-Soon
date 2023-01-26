package Chess.BoardAndControls;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
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
				spots[i][j] = new JButton(board[j][i].code);      //TODO: why the flip?
//				spots[i][j].setIcon((new ImageIcon(ImageIO.read(board[i][j].image))));
//				spots[i][j].setIcon((new ImageIcon(ImageIO.read(new File("C:\\Users\\akshd\\IdeaProjects\\Chess\\Chess\\assets\\BlackKing.svg")))));
//				spots[i][j].setText("Hola");
				spots[i][j].setBackground((i+j)%2 == 0 ? Color.WHITE:Color.BLACK);
				spots[i][j].setBounds(i*dimensions/10, j*dimensions/10, dimensions/10, dimensions/10);
				int finalI = i;
				int finalJ = j;
				spots[i][j].addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("Called BoardGUI");
						int[] position = {finalI, finalJ};
						Board.showPossibleMoves(board, position);
					}
				});  ;
				frame.add(spots[i][j]);
			}
		}

		frame.setSize(dimensions, dimensions);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
