package hangman.model;

import static org.junit.Assert.assertEquals;

import org.junit.Assert.*;

import hangman.exceptions.HangmanException;

import org.junit.Test;


/*          
 * 																			OriginalScore
 * 
 *              Numero:                        			     1,                                  	  			2,                        							  3
 *              Clase de equivalencia: 			incorrectCount < 0 o correctCount < 0,  			0 <= incorrectCount <= 10,        						incorrectCount > 10
 *              Resultado:                   Arroja una Excepcion (HangManException),      	  puntajeObtenido entre 0 y 100,          				 puntajeObtenido igual a 0
 *              
 *              															 BoundScore
 *              
 *              Numero:                                      1, 												2.		  								 				3, 						        								
 *              Clase de equivalencia: 		  incorrectCount > ,     						  		correctCount*2 =< incorrectCount						correctCount*2 > incorrectCount
 *              Resultado: 					Arroja una Excepcion (HangManException), 			      puntajeObtenido = 0							puntajeObtenido es 10*correctCount - 5 *incorrectCount      							
 *              
 *              
 *              															PowerScore
 *              Numero: 									1,														2,				                               				  		3, 																			4
 *              Clase de equivalencia: 			Incorrect < 0 Correct <0, 					   	(E(5^i) - 8* incorrectCount) > 500, i = #correctCount                      (E(5^i) - 8* incorrectCount) < 0, i = #correctCount					 0 < (E(5^i) - 8* incorrectCount) < 500, i = #correctCount
 *              Resultado:					Arroja una Excepcion (HangManException),	  			        puntajeObtenido = 500													puntajeObtenido es 0														puntajeObtenido es(E(5^i) - 8* incorrectCount
 *              
 *              

 */


public class GameScoreTest {
	
	//ORIGINAL SCORE--------------------------------------------------------
	@Test
	public void validateOriginalScoreExeptionOutOfRangeIncorrectCount() {
		OriginalScore score = new OriginalScore();
		try {
			assertEquals(0, score.calculateScore(10, -1));
	    } catch (HangmanException e) {
	        assertEquals(e.getMessage(),(HangmanException.OUT_LIMITS_COUNTS));
	    }	
	}
	
	@Test
	public void validateOriginalScoreExeptionOutOfRangeCorrectCount() {
		OriginalScore score = new OriginalScore();
		try {
			assertEquals(0, score.calculateScore(-2, 0));
	    } catch (HangmanException e) {
	        assertEquals(e.getMessage(),(HangmanException.OUT_LIMITS_COUNTS));
	    }
		
	}
	
	@Test
	public void validateOriginalScoreCorrectoScore() {
		OriginalScore score = new OriginalScore();
		try {
			assertEquals(50, score.calculateScore(5, 5));
			assertEquals(100, score.calculateScore(0, 0));
			assertEquals(20, score.calculateScore(200, 8));
			assertEquals(90, score.calculateScore(9, 1));
	    } catch (HangmanException e) {
	        assertEquals(e.getMessage(),(HangmanException.NO_CASE_POSSIBLE));
	    }
	}
	
	@Test
	public void validateOriginalScoreZeroScore() {
		OriginalScore score = new OriginalScore();
		try {
			assertEquals(0, score.calculateScore(2, 10));
			assertEquals(0, score.calculateScore(0, 10));
			assertEquals(0, score.calculateScore(200, 10));
			assertEquals(0, score.calculateScore(9, 10));
	    } catch (HangmanException e) {
	        assertEquals(e.getMessage(),(HangmanException.NO_CASE_POSSIBLE));
	    }
	}
	
	//BONUS SCORE--------------------------------------------------------
	

		@Test
		public void validateBonusScoreExeptionOutOfRangeIncorrectCount() {
			BonusScore score = new BonusScore();
			try {
				assertEquals(0, score.calculateScore(10, -3));
		    } catch (HangmanException e) {
		        assertEquals(e.getMessage(),(HangmanException.OUT_LIMITS_COUNTS));
		    }	
		}
		
		@Test
		public void validateBonusScoreExeptionOutOfRangeCorrectCount() {
			BonusScore score = new BonusScore();
			try {
				assertEquals(0, score.calculateScore(-4, 0));
		    } catch (HangmanException e) {
		        assertEquals(e.getMessage(),(HangmanException.OUT_LIMITS_COUNTS));
		    }
			
		}
		
		@Test
		public void validateBonusScoreCorrectoScore() {
			BonusScore score = new BonusScore();
			try {
				assertEquals(185, score.calculateScore(20, 3));
				assertEquals(80, score.calculateScore(10, 4));
				assertEquals(1960, score.calculateScore(200, 8));
		    } catch (HangmanException e) {
		        assertEquals(e.getMessage(),(HangmanException.NO_CASE_POSSIBLE));
		    }
		}
		
		@Test
		public void validateBonusScoreZeroScore() {
			BonusScore score = new BonusScore();
			try {
				assertEquals(0, score.calculateScore(2, 4));
				assertEquals(0, score.calculateScore(10, 20));
				assertEquals(0, score.calculateScore(200, 400));
				assertEquals(0, score.calculateScore(9, 18));
				assertEquals(0, score.calculateScore(0, 1));
		    } catch (HangmanException e) {
		        assertEquals(e.getMessage(),(HangmanException.NO_CASE_POSSIBLE));
		    }
		}
		
		//POWER SCORE--------------------------------------------------------
		
		@Test
		public void validatePowerScoreExeptionOutOfRangeIncorrectCount() {
			PowerScore score = new PowerScore();
			try {
				assertEquals(0, score.calculateScore(10, -1));
		    } catch (HangmanException e) {
		        assertEquals(e.getMessage(),(HangmanException.OUT_LIMITS_COUNTS));
		    }	
		}
		
		@Test
		public void validatePowerScoreExeptionOutOfRangeCorrectCount() {
			PowerScore score = new PowerScore();
			try {
				assertEquals(0, score.calculateScore(-2, 0));
		    } catch (HangmanException e) {
		        assertEquals(e.getMessage(),(HangmanException.OUT_LIMITS_COUNTS));
		    }
			
		}
		
		@Test
		public void validatePowerScoreCorrectoScore() {
			PowerScore score = new PowerScore();
			try {
				assertEquals(131, score.calculateScore(3, 3));
				assertEquals(380, score.calculateScore(4, 50));
		    } catch (HangmanException e) {
		        assertEquals(e.getMessage(),(HangmanException.NO_CASE_POSSIBLE));
		    }
		}
		
		@Test
		public void validatePowerScoreZeroScore() {
			PowerScore score = new PowerScore();
			try {
				assertEquals(0, score.calculateScore(2, 1000));
				assertEquals(0, score.calculateScore(1, 2));
		    } catch (HangmanException e) {
		        assertEquals(e.getMessage(),(HangmanException.NO_CASE_POSSIBLE));
		    }
		}
		
		@Test
		public void validatePowerScorePerfectScore() {
			PowerScore score = new PowerScore();
			try {
				assertEquals(500, score.calculateScore(100, 4));
				assertEquals(500, score.calculateScore(4, 10));

		    } catch (HangmanException e) {
		        assertEquals(e.getMessage(),(HangmanException.NO_CASE_POSSIBLE));
		    }
		}

}
