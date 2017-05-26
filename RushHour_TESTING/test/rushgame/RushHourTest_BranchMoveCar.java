package rushgame;

import static org.junit.Assert.*;

import org.junit.Test;

public class RushHourTest_BranchMoveCar {

	@Test
	public void testMoveCarAvanti(){
		RushHour x = new RushHour();
		assertFalse(x.moveCar(0, 4, 1));
		assertFalse(x.moveCar(0, 4, 1));//caso in cui siamo al limite in alto (riga 0)
		assertFalse(x.moveCar(2, 5, 1)); //caso in cui non siamo al limite ma c'è una macchina sopra
		assertTrue(x.moveCar(2, 2, 1)); //caso ok
	}
	
	@Test
	public void testMoveCarDestra() {
		RushHour x = new RushHour();
		assertFalse(x.moveCar(1, 5, 2)); //caso in cui siamo al limite a destra (colonna 5)
		assertTrue(x.moveCar(2, 2, 2)); //caso ok
		assertTrue(x.moveCar(2, 3, 2));
		assertFalse(x.moveCar(2, 4, 2)); //caso in cui troviamo una macchina a destra
	}
	
	@Test
	public void testMoveCarSotto() {
		RushHour x = new RushHour();
		assertTrue(x.moveCar(4, 1, 3)); //caso ok 
		assertFalse(x.moveCar(5, 1, 3)); //caso in cui siamo al limite inferiore 
		assertFalse(x.moveCar(2, 5, 3)); //caso in cui non siamo al limite ma c'è una macchina sotto
	}
	
	@Test
	public void testMoveCarSinistra() {
		RushHour x = new RushHour();
		assertTrue(x.moveCar(4, 1, 4)); //caso ok 
		assertFalse(x.moveCar(4, 0, 4)); //caso in cui siamo al limite  sinistro
		assertTrue(x.moveCar(1, 5, 1));
		assertTrue(x.moveCar(0, 5, 4));
		assertFalse(x.moveCar(0, 4, 4)); //caso in cui non siamo al limite ma c'è una macchina a sinistra
		
	}

	@Test
	public void testMoveDirectionWrong() {
		RushHour x = new RushHour();
		assertFalse(x.moveCar(2, 2, 7)); //caso in cui errore comando pos
		
	}

}


