package rushgame;

import static org.junit.Assert.*;

import org.junit.Test;

public class RushHourTest {

	@Test
	public void testRushHour() {
		RushHour w = new RushHour();
		assertEquals(6, w.griglia[0][3]);
		assertEquals(1, w.griglia[2][2]);
		assertEquals(2, w.griglia[1][5]);
		assertEquals(3, w.griglia[2][5]);
		assertEquals(4, w.griglia[3][5]);
		assertEquals(5, w.griglia[4][1]);
	}



	@Test
	public void testRedCarAtExit() {
		RushHour x = new RushHour();
		assertTrue(!x.redCarAtExit());
	}
}

