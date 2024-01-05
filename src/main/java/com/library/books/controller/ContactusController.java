package com.library.books.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactusController {
	@RequestMapping("/contactus")
	public String contactus() {
		return "contactus";
	}

}
