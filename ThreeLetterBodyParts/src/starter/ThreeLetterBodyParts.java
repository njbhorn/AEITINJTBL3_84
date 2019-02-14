package starter;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ThreeLetterBodyParts {
	
	String[] parts = {"arm","leg","toe","lip","gum","hip","eye","ear","jaw","rib"} ;
	Set<String> partsList = new TreeSet<> ( Arrays.asList(parts)) ;
	Map<String, Boolean> guessList = new TreeMap<>() ;
	Scanner sc ;
	int noGuesses = 0 ;
	int correctGuesses = 0 ;

	public static void main(String[] args) {
		
		ThreeLetterBodyParts tlbp = new ThreeLetterBodyParts();
		tlbp.playGame();
		
//		new ThreeLetterBodyParts().playGame(); ;
		
	}

	private void playGame() {
		
		
		initialise() ;
		while ( correctGuesses < 10 ) {
			String guess = promptUser();
			checkValue(guess) ;
			showStatus() ;
		}
		
		
	}

	private  void showStatus() {
		System.out.println(Arrays.toString(parts));
		System.out.println(partsList);
		System.out.println(guessList);
		System.out.printf("No of Guesses : %d No Correct : %d\n", noGuesses, correctGuesses);
		
	}

	private  void checkValue(String guess) {
		noGuesses++ ;
		if ( guess.length() != 3 ) {
			System.out.println("Sorry needs to be 3 characters!");
		}
		if ( partsList.contains(guess) ) {
			if ( guessList.get(guess)) {
				System.out.printf("%s already guessed!\n", guess);
			} else {
				guessList.put(guess, true) ;
				correctGuesses++ ;
			}
			
			System.out.printf("%s is Correct!\n", guess);
		}
		
	}

	private  String promptUser() {
		System.out.println("Please enter a 3 letter body part : ");
		return sc.nextLine() ;
	}

	private  void initialise() {
		
		for ( String key : partsList ) {
			guessList.put(key, false ) ;
		}
		sc = new Scanner ( System.in ) ;
	}

}
