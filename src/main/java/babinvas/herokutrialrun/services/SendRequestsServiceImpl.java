package babinvas.herokutrialrun.services;

import babinvas.herokutrialrun.entities.Developer;
import org.springframework.stereotype.Service;

@Service
public class SendRequestsServiceImpl implements SendRequestsService {
	public String receiveDeveloper(long id) {
		if (!Developer.hasId(id)) {
			return "У нас такого разработчика нет! \n" +
					"Изиняй!";
		}

		return Developer.getName(id);
	}
}
