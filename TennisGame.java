import java.util.*;
import java.lang.*;
import java.io.*;

class TennisGame
{
	int playerA;
	int playerB;
	
	TennisGame() {
		playerA = 0;
		playerB = 0;
	}
	
	void computeScores(String scores) {
        boolean wins = false;
        for (int i = 0; i < scores.length(); i++) {
            if (scores.charAt(i) == 'A') {
                playerA++;
            } else if (scores.charAt(i) == 'B') {
                playerB++;   
            }
            wins = checkIfWon();
                if(wins) {
                    playerA = 0;
                    playerB = 0;
                } else
                    printScores();      
        }
    }
	
	private void printScores() {
		System.out.println("printing scores");
	}

	boolean checkIfWon() {
        boolean wins = false;
        
        if (playerA >= 3 && (playerA - playerB == 2)){
            System.out.println("Player A wins");
            wins = true;
        } else if (playerB >=3 && (playerB - playerA == 2)) {
            System.out.println("Player B wins");
            wins = true;
          }
        
        return wins;
    }
    
	public static void main (String[] args) throws java.lang.Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string of scores.\n");
		String scoreString = scanner.nextLine();
		
		TennisGame tennisGame = new TennisGame();
		tennisGame.computeScores(scoreString);
		return;
	}
}