package tacos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import tacos.model.entities.Ingredient;

@Controller
public class HomeController {

	@GetMapping("/")
	public String getHomePage() {
		return "home";
	}
}
