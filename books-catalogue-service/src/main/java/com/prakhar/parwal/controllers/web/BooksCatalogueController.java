package com.prakhar.parwal.controllers.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BooksCatalogueController {

	@GetMapping("/books-catalogue")
	public ModelAndView showBooksCatalogue() {
		
		ModelAndView booksCatalogue = new ModelAndView("books-catalogue");
		return booksCatalogue;
	}
}
