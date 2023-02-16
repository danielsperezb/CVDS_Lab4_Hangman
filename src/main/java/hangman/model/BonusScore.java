package hangman.model;

/**
 * @throws hangman.exceptions.HangmanException
 * @pre El puntaje inicia en 0 puntos
 * @pos El puntaje debe estar en el siguiente rango [0,*)
 * @pos Cada acierto suma 10
 * @pos Cada error resta 5
 * @param correctCount - Cantidad de aciertos
 * @param incorrectCount - Cantidad de errores
 * @return puntaje obtenido
 */
public class BonusScore implements GameScore{
	public int calculateScore(int correctCount,int incorrectCount) {
		return 0;
	}
}
