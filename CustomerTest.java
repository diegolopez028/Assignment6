import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomerTest {
	Customer c = new Customer("Diego",22);

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetAge() {
		assertEquals(22,c.getAge());
	}

	@Test
	void testGetName() {
		assertEquals("Diego",c.getName());
	}

}
