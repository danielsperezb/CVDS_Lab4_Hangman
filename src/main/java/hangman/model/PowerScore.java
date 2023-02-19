package hangman.model;

import hangman.exceptions.HangmanException;

/**
 * @throws hangman.exceptions.HangmanException
 * @pre El puntaje inicia en 0 puntos
 * @pos El puntaje debe estar en el siguiente rango [0,500]
 * @pos Cada acierto suma 5 elevado a la i, dependiendo de la posicion de la letra
 * @pos Cada error resta 8
 * @param correctCount - Cantidad de aciertos
 * @param incorrectCount - Cantidad de errores
 * @return puntajeObtenido
 */
public class PowerScore implements GameScore{
	public int calculateScore(int correctCount,int incorrectCount) throws HangmanException {
		
		int puntajeObtenido = 0;
		
		if (correctCount < 0 || incorrectCount < 0) {
			throw new HangmanException(HangmanException.OUT_LIMITS_COUNTS);
		}else {
			int totalCorrect = 0;
	        for(int i=1;i<=correctCount;i++) {
	        	totalCorrect+= Math.pow(5, i);
	        }
	        puntajeObtenido = totalCorrect - 8*incorrectCount;
	        		
	        if(puntajeObtenido > 500) {
	        	puntajeObtenido = 500;
	        	return puntajeObtenido;
	        }else if(puntajeObtenido < 0) {
	        	puntajeObtenido = 0;
	        	return puntajeObtenido;
	        }else if(!(puntajeObtenido > 500) && !(puntajeObtenido < 0)) {
	        	return puntajeObtenido;
	        }else {
	        	throw new HangmanException(HangmanException.NO_CASE_POSSIBLE);
	        }
		}
		
	}
	
	public int getPuntajeInicial() {
		return 0;
	}
}
