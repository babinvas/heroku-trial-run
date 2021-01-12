package babinvas.herokutrialrun.entities;

import java.util.Arrays;
import java.util.List;

public class Developer {
	final private static List<Developer> developers = Arrays.asList(
			new Developer(1L, "Станислав"),
			new Developer(2L, "Михаил"),
			new Developer(3L, "Георгий"),
			new Developer(4L, "Crazy Bot %)"),
			new Developer(5L, "Василий")
	);

	final private long id;
	final private String name;

	private Developer(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public static boolean hasId(long developerId) {
		for (Developer developer : developers) {
			if (developerId == developer.id) {
				return true;
			}
		}

		return false;
	}

	public static String getName(long developerId) {
		for (Developer developer : developers) {
			if (developerId == developer.id) {
				return developer.name;
			}
		}

		return null;
	}
}
