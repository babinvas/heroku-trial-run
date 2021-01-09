package babinvas.herokutrialrun.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class MainRestController {
	@PostMapping("/rest/{id}")
	public String receiveDeveloper(@PathParam("id") String id) {
		return null;
	}
}
