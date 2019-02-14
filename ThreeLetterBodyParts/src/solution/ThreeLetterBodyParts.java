package solution;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.time.Period;
import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ThreeLetterBodyParts {
	
	int noGuesses ;
	String[] parts = {"arm","leg","toe","lip","gum","hip","eye","ear","jaw","rib"} ;
	Set<String> partsList = new TreeSet<>(Arrays.asList(parts));
	Map<String,Boolean> guessList = new TreeMap<>();
	
	public static void main(String[] args) {

		new ThreeLetterBodyParts().playGame() ;

	}
	
	private void playGame() {
		LocalTime start = null , end = null ;
		System.out.println(parts.length);
		System.out.println(partsList);
		initialise() ;
		System.out.println(guessList);
		while ( getCorrectGuesses() < 10 ) {
			String guess = promptUser() ;
			if ( noGuesses == 0 ) {
				start = LocalTime.now() ;
			}
			String status = checkGuess(guess);
			if ( !status.equals("") ) {
				System.out.println(status);
			}
			showStatus();
		}
		end = LocalTime.now();
		Duration d = Duration.between(start, end);
		System.out.printf("Finished in %s seconds\n", d.getSeconds());
	}

	private int getCorrectGuesses() {
		int correctGuesses = 0 ;
		for ( Entry<String, Boolean >  e : guessList.entrySet() ) {
			if ( e.getValue() ) {
				correctGuesses++ ;
			}
		}
		return correctGuesses;
	}

	private void initialise() {
		for ( String part : partsList ) {
			guessList.put(part, false) ;
		}
		
	}

	private void showStatus() {
		System.out.println(guessList);
		System.out.printf("Guesses : %d Correct : %d \n", noGuesses, getCorrectGuesses());
	}

	private String checkGuess(String guess) {
		boolean correct = false ;
		boolean guessed = true ;
		int length = guess.length();
		String status = "" ;
		noGuesses++ ;
		if ( length != 3 ) {
			status = String.format("Sorry that was not 3 letters, you entered %d???", guess.length());
			return status ;
		}
		correct = partsList.contains(guess);
		if ( correct ) {
			guessed = guessList.get(guess);
			if (!guessed) {
				guessList.put(guess, true) ;
			} else {
				status = String.format("Whoops already guessed '%s'", guess) ;
			}
		}
	
		return status ;
	}

	private String promptUser() {
		String msg = "Please enter a 3 letter body part : " ;
		System.out.println(msg);
		Scanner sc = new Scanner ( System.in);
		return sc.nextLine();
	}

}
