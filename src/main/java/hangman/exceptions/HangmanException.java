package hangman.exceptions;

public class HangmanException extends Exception {
	public static final String OUT_LIMITS_COUNTS="Counts get out of border";
	public static final String NO_CASE_POSSIBLE="Contact Support";

	public HangmanException(String message) {
		super(message);
	}

}
