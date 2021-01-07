package babinvas.herokutrialrun.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/")
	public String welcomeHtmlPage() {
		return "WelcomePage.html";
	}
}
