import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BevShopTest {
	BevShop b = new BevShop();

	@BeforeEach
	void setUp() throws Exception {
		b.getCurrentOrder().addNewBeverage("Coffee", Size.MEDIUM, true, false);
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIsValidTime() {
		assertTrue(b.isValidTime(8));
	}


	@Test
	void testIsMaxFruit() {
		assertTrue(b.isMaxFruit(6));
	}

	@Test
	void testIsEligibleForMore() {
		assertTrue(b.isEligibleForMore());
	}

	@Test
	void testTotalOrderPrice() {
		assertEquals(12.0,b.getCurrentOrder().calcOrderTotal());
	}

	
}
