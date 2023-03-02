package hangman.model;
import hangman.exceptions.HangmanException;
//Actualizado
/**
 * @throws hangman.exceptions.HangmanException
 * @pre El puntaje inicia en 100 puntos
 * @pos El puntaje debe estar en el siguiente rango [0,100]
 * @pos Cada acierto suma 0
 * @pos Cada error resta 10
 * @param correctCount - Cantidad de aciertos
 * @param incorrectCount - Cantidad de errores
 * @return puntajeObtenido
 */

public class OriginalScore implements GameScore{
	public int calculateScore(int correctCount,int incorrectCount) throws HangmanException {
		int puntajeObtenido = 100;
		
		if (correctCount < 0 || incorrectCount < 0) {
			throw new HangmanException(HangmanException.OUT_LIMITS_COUNTS);
		}else if ( incorrectCount >= 0 && incorrectCount <= 10){
			puntajeObtenido = puntajeObtenido-(incorrectCount*10);
		}else if(incorrectCount > 10) {
			puntajeObtenido = 0;
		}else {
			throw new HangmanException(HangmanException.NO_CASE_POSSIBLE);
		}
		return puntajeObtenido;
	}
	
	public int getPuntajeInicial() {
		return 100;
	}
}


