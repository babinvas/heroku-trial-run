package babinvas.herokutrialrun.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class DeveloperTest {
	@Test
	void testHasId_ShouldReturnTrue() {
		for (int i = 1; i < 6; i++) {
			Assertions.assertTrue(Developer.hasId(i));
		}
	}

	@Test
	void testHasId_ShouldReturnFalse() {
		int[] id = {-1, 0, 6, 10, 1000};

		for (int i : id) {
			Assertions.assertFalse(Developer.hasId(i));
		}
	}

	@Test
	void testGetName() {
		List<String> expectedNames = Arrays.asList("Станислав", "Михаил", "Георгий", "Crazy Bot %)", "Василий");

		for(int i = 0; i < 5; i++) {
			String expectedName = expectedNames.get(i);
			String actualName = Developer.getName(i + 1);

			Assertions.assertEquals(expectedName, actualName);
		}
	}
}