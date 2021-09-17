package com.bridgelabz.tictactoe;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {

	static char[] board = new char[10];
	static String turn;

	public static void main(String[] args) {
		System.out.println("This is Tic-Tac-Toe Game");
		initBoard();
		int player = Toss();
		// player checked 1-user, 0-computer
		if (player == 1) {
			System.out.println("User plays first.");
			chooseLetter();
		}
		if (player == 0) {
			System.out.println("Computer plays first.");
			chooseLetter();
		}
	}

	public static void initBoard() {
		for (int i = 1; i <= 9; i++) {
			board[i] = ' ';
		}
	}

	// Function to choose letter X or O
	public static String chooseLetter() {
		System.out.println("Choose either X or O: ");
		Scanner letter = new Scanner(System.in);
		String inputLetter = letter.next();
		if (inputLetter.equals("X")) {
			turn = "X";
		} else {
			turn = "O";
		}
		return turn;
	}

	// Function to generate random player
	public static int Toss() {
		System.out.println("Toss to see who plays first!");
		Random random = new Random();
		return random.nextInt(2);
	}

}