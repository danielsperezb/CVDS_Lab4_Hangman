package hangman.model;

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
	public int calculateScore(int correctCount,int incorrectCount) {
		return 0;
	}
}


