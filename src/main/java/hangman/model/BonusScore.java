package hangman.model;
import hangman.exceptions.HangmanException;

/**
 * @throws hangman.exceptions.HangmanException
 * @pre El puntaje inicia en 0 puntos
 * @pos El puntaje debe estar en el siguiente rango [0,*)
 * @pos Cada acierto suma 10
 * @pos Cada error resta 5
 * @param correctCount - Cantidad de aciertos
 * @param incorrectCount - Cantidad de errores
 * @return puntajeObtenido
 */
public class BonusScore implements GameScore{
	
	public int calculateScore(int correctCount,int incorrectCount) throws HangmanException{
		
		if (correctCount < 0 || incorrectCount < 0) {
			throw new HangmanException(HangmanException.OUT_LIMITS_COUNTS);
		}else if ( correctCount*2 > incorrectCount){
			return 10*correctCount - 5 *incorrectCount;
		}else if(correctCount*2 <= incorrectCount) {
			return 0;
		}else {
			throw new HangmanException(HangmanException.NO_CASE_POSSIBLE);
		}

	}
	
	public int getPuntajeInicial() {
		return 0;
	}
}
