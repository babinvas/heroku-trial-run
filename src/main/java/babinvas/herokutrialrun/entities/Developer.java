package babinvas.herokutrialrun.entities;

import java.util.Arrays;
import java.util.List;

public class Developer {
	final private static List<Developer> developers = Arrays.asList(
			new Developer(1, "Станислав"),
			new Developer(2, "Михаил"),
			new Developer(3, "Георгий"),
			new Developer(4, "Crazy Bot %)"),
			new Developer(5, "Василий")
	);

	final private int id;
	final private String name;

	private Developer(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static boolean hasId(int developerId) {
		for (Developer developer : developers) {
			if (developerId == developer.id) {
				return true;
			}
		}

		return false;
	}

	public static String getName(int developerId) {
		for (Developer developer : developers) {
			if (developerId == developer.id) {
				return developer.name;
			}
		}

		return null;
	}
}
