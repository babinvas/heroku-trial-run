package babinvas.herokutrialrun.services;

import babinvas.herokutrialrun.entities.Developer;

public interface SendRequestsService {
	Developer receiveDeveloper(String id);
}
