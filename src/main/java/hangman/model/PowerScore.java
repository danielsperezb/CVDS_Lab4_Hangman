package hangman.model;

/**
 * @throws hangman.exceptions.HangmanException
 * @pre El puntaje inicia en 0 puntos
 * @pos El puntaje debe estar en el siguiente rango [0,500]
 * @pos Cada acierto suma 5 elevado a la i, dependiendo de la posicion de la letra
 * @pos Cada error resta 8
 * @param correctCount - Cantidad de aciertos
 * @param incorrectCount - Cantidad de errores
 * @return puntaje obtenido
 */
public class PowerScore implements GameScore{
	public int calculateScore(int correctCount,int incorrectCount) {
		return 0;
	}
}
