package babinvas.herokutrialrun.entities;

import java.util.Arrays;
import java.util.List;

public class Developer {
	final private static List<Developer> developers = Arrays.asList(
			new Developer(1L, "Стас"),
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

	public int developersLength() {
		return developers.size();
	}

	public Developer getDeveloper(Long developerId) {
		for (Developer developer : developers) {
			if (developerId == developer.id) {
				return developer;
			}
		}

		return null;
	}
}
