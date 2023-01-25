public class Main {
	public static String[][] board;
	public static void main(String[] args) {
		board = new String[8][8];
		Initialise.initialiseBoard(board);
		Display.printBoard(board);
	}
}