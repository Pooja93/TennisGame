import java.util.*;
import java.lang.*;
import java.io.*;

class TennisGame
{
	int playerA;
	int playerB;
	
	TennisGame()
	{
		playerA = 0;
		playerB = 0;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string of scores.\n");
		String scoreString = scanner.nextLine();
		
		TennisGame tennisGame = new TennisGame();
		
		tennisGame.computeScores(scoreString);
		
		return;
	}
}