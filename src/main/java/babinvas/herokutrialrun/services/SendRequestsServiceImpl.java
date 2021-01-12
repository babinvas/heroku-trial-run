package babinvas.herokutrialrun.services;

import babinvas.herokutrialrun.entities.Developer;
import org.springframework.stereotype.Service;

@Service
public class SendRequestsServiceImpl implements SendRequestsService {
	public String receiveDeveloper(long id) {
		if (!Developer.hasId(id)) {
			return "Ошибка ввода: У нас такого разработчика нет! \n\n" +
					"Извиняйте!";
		}

		return "Наш разработчик: " + Developer.getName(id);
	}
}
