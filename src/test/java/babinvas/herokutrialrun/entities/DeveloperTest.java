package babinvas.herokutrialrun.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DeveloperTest {

	@Test
	void testHasId_ShouldReturnTrue() {
		for (long i = 1L; i < 6L; i++) {
			Assertions.assertTrue(Developer.hasId(i));
		}
	}

	@Test
	void testHasId_ShouldReturnFalse() {
		long[] id = {-1L, 0L, 6L, 10L, 1000L};

		for (long i : id) {
			Assertions.assertFalse(Developer.hasId(i));
		}
	}

	@Test
	void testGetName() {
	}
}