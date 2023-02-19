package hangman.model;

import hangman.exceptions.HangmanException;

public interface GameScore {
	public int calculateScore(int correctCount,int incorrectCount) throws HangmanException;
}

