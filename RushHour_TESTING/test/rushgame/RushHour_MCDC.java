package rushgame;

import static org.junit.Assert.*;

import org.junit.Test;

public class RushHour_MCDC {

	@Test
	public void test() {
		
		RushHour rh = new RushHour();
		assertFalse(rh.moveCar(6, 3, 3)); // test riga > 5
		assertFalse(rh.moveCar(-4, 3, 2)); // test riga < 0
		assertFalse(rh.moveCar(3, 6, 2)); // test colonna > 5
		assertFalse(rh.moveCar(3, -3, 2)); // test colonna < 0
		assertFalse(rh.moveCar(-4, 3, 2)); // test riga < 0
		assertFalse(rh.moveCar(2, 1, 2)); // test cella vuota
		assertTrue(rh.moveCar(2, 2, 2)); //test spsostamento ok
		
				
		
		
		
	}

}
