public class Display {
	public static void printBoard(String[][] board) {
		for(int i = 0;i < 8;i++) {
			for (int j = 0; j < 8; j++)
				System.out.print(board[i][j] + "\t");
			System.out.println();
		}
	}
}
