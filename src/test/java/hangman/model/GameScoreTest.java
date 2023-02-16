package hangman.model;

import static org.junit.Assert.assertEquals;

import org.junit.Assert.*;
import org.junit.Test;


/*          
 * 																			OriginalScore
 * 
 *              Numero:                        			     1,                                  	  2,                          3
 *              Clase de equivalencia: 			incorrectCount < 0 o correctCount < 0,  	0 <= incorrectCount <= 10,        incorrectCount > 10
 *              Resultado:                   Arroja una Excepcion (HangManException),      	  puntajeObtenido entre 0 y 100,           puntajeObtenido igual a 0
 *              
 *              															 BoundScore
 *              
 *              Numero:                                      1, 										   	2, 						        								
 *              Clase de equivalencia: 		  incorrectCount < 0  o correctCount < 0,     			correctCount >=0 o  incorrectCount >=0 
 *              Resultado: 					Arroja una Excepcion (HangManException), 			puntajeObtenido es 10*correctCount - 5 *incorrectCount      							
 *              
 *              
 *              
 *              Numero: 									1,												2,				                                 3, 			
 *              Clase de equivalencia: 			Incorrect < 0 Correct <0, 					   0=5 < correctCount <= 3                                     correctCount > 3 
 *              Resultado:					Arroja una Excepcion (HangManException),	puntajeObtenido es 5^correctCount - 8(incorrectCount)           untajeObtenido es 500
 *              
 *              

 */


public class GameScoreTest {
	
	@Test
	public void validateExeptionOutOfRangeIncorrectCountAndCorrectCount() {
		//OriginalScore originalScore = new OriginalScore();
		
	}

}
