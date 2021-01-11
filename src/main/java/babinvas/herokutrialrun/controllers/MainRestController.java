package babinvas.herokutrialrun.controllers;

import babinvas.herokutrialrun.services.SendRequestsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class MainRestController {
	private final SendRequestsService sendRequestsService;

	@Autowired
	public MainRestController(SendRequestsService sendRequestsService) {
		this.sendRequestsService = sendRequestsService;
	}

	@PostMapping("/rest/{id}")
	public String receiveDeveloper(@PathParam("id") String id) {
		long longId;

		try {
			longId = Long.getLong(id);
		} catch (RuntimeException e) {
			return "Необходимо вести id, как целое число.";
		}

		return sendRequestsService.receiveDeveloper(longId);
	}
}
