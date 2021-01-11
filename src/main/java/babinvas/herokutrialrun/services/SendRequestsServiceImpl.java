package babinvas.herokutrialrun.services;

import babinvas.herokutrialrun.entities.Developer;
import org.springframework.stereotype.Service;

@Service
public class SendRequestsServiceImpl implements SendRequestsService {
	public Developer receiveDeveloper(String id) {
		return new Developer();
	}
}
