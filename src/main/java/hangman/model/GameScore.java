package hangman.model;

import hangman.exceptions.HangmanException;

public interface GameScore {
	public int calculateScore(int correctCount,int incorrectCount) throws HangmanException;
	public static int getPuntajeInicial() {
		// TODO Auto-generated method stub
		return 0;
	}
}

