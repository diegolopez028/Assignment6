import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SmoothieTest {
	Smoothie s = new Smoothie("Diego", Size.SMALL, 2, true);

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetNumOfFruits() {
		assertEquals(2,s.getNumOfFruits(),2);
	}

	@Test
	void testGetAddProtein() {
		assertEquals(true,s.getAddProtein());
		
	}

	@Test
	void testGetFruitCost() {
		assertEquals(.50,s.getFruitCost());
	}

	@Test
	void testGetProteinCost() {
		assertEquals(1.50,s.getProteinCost());
	}

}
