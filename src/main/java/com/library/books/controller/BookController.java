package com.library.books.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.library.books.BookEntity;
import com.library.books.service.BookService;

@Controller
public class BookController {
	@Autowired
	BookService bookService;

	@RequestMapping("/retrievebook")
	public String retrieveBook(Model m) {
		// System.out.println("hello books"+bookService.getBook());
		m.addAttribute("mssg", bookService.getBook());
		return "retrievebook";
	}

	@RequestMapping("/search")
	public String searchbook() {
		return "bookinput";
	}

	@RequestMapping("/searchBook")
	public String findByBookName(Model m, @RequestParam String book_Name) {
		BookEntity book = bookService.findByBookService(book_Name);

		if (book != null) {
			m.addAttribute("mssg", book);
			return "searchbook";
		} else {
			m.addAttribute("mssg", "Oop's Book Not Available");
			return "logincontent";
		}

	}

	@RequestMapping("/addBook")
	public String addBook(Model m, @RequestParam int book_id, @RequestParam String book_name,
			@RequestParam int book_count, @RequestParam String book_author) {
		if (bookService.addBookService(new BookEntity(book_id, book_count, book_name, book_author)) == 1) {
			m.addAttribute("mssg", "Data Added Succesfully");
			return "logincontent";
		} else {

			m.addAttribute("mssg", "Oops! Something Went Wrong");
			return "searchbook";
		}
	}

	@RequestMapping("/addBookPage")
	public String addBookPage() {
		return "addBook.html";
	}

}
