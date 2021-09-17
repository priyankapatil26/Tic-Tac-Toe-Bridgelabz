package JAVAFIRST;

public class TicTacToeGame {
	char[] board = new char[10];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is Tic-Tac-Toe Game");
	}
		public void InitBoard() {
		for(int i=1;i<=9;i++) {
			board[i]=0;
		}
		}
}
