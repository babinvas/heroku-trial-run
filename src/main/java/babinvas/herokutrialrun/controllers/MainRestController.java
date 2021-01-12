package babinvas.herokutrialrun.controllers;

import babinvas.herokutrialrun.services.SendRequestsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {
	private final SendRequestsService sendRequestsService;

	@Autowired
	public MainRestController(SendRequestsService sendRequestsService) {
		this.sendRequestsService = sendRequestsService;
	}

	@GetMapping("/rest/{id}")
	public String receiveDeveloper(@PathVariable("id") String id) {
		long longId;

		try {
			longId = Long.parseLong(id);
		} catch (RuntimeException e) {
			return "Ошибка ввода: Необходимо вести id, как целое число.";
		}

		return sendRequestsService.receiveDeveloper(longId);
	}
}
