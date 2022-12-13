import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CoffeeTest {
	Coffee c = new Coffee("Diego", Size.MEDIUM, true, true);

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCalcPrice() {
		assertEquals(13,c.calcPrice(),13);
	}

	@Test
	void testToString() {
		assertTrue(c.toString().contains("size"));
	}

	@Test
	void testGetExtraShot() {
		assertEquals(true,c.getExtraShot());
	}

	@Test
	void testGetExtraSyrup() {
		assertEquals(true,c.getExtraSyrup());
	}

}
