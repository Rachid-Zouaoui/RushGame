package rushgame;

import static org.junit.Assert.*;

import org.junit.Test;

public class RedCarExitTest {

	@Test 
	public void test() {
		RushHour rh = new RushHour();
		assertTrue(!rh.redCarAtExit());
		assertTrue(rh.moveCar(2, 5, 4));
		assertTrue(rh.moveCar(2, 4, 3));
		assertTrue(rh.moveCar(2, 2, 2));
		assertTrue(rh.moveCar(2, 3, 2));
		assertTrue(rh.moveCar(2, 4, 2));
		assertTrue(rh.redCarAtExit());
		
	}

}
