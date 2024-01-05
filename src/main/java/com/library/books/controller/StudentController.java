package com.library.books.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.library.books.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	StudentService service;

	@RequestMapping("/status")
	public String status() {
		return "status";
	}

	@RequestMapping("/studentstatus")
	public String studentStatus() {
		return "checkstudentstatus";
	}

	@RequestMapping("/addbookvisitodetails")
	public String addVisitorDetails() {
		return "bookvisitors";
	}

	@RequestMapping("/addBookVisitors")

	public String addBookVisitors(Model m, @RequestParam int stu_id, @RequestParam String book_Name) {
		if (service.addBookVisitorsService(stu_id, book_Name) == 1) {

			m.addAttribute("mssg", "Data Added succesfully");
			return "logincontent";
		} else {

			m.addAttribute("mssg", "Oop's book is not available in library ");
			return "logincontent";
		}
	}

//	@RequestMapping("/bookvisitors")
//	public String bookVisitors(Model m) {
//		m.addAttribute("mssg","")
//		return "added";
//		
//	}
	@RequestMapping("/returnbookPage")
	public String returnBookPage() {
		return "returnbook";
	}

	@RequestMapping("/returnbook")

	public String returnBook(Model m, @RequestParam int id, @RequestParam String book_Name) {
		if (service.returnBookService(id, book_Name) == 1) {
			m.addAttribute("mssg", "successfully returned");
			return "logincontent";
		} else {
			m.addAttribute("mssg", "Invalid details");

			return "logincontent";
		}
	}

	@RequestMapping("/checkStatus")

	public String checkStatus(Model m, @RequestParam int id) {
		if (service.checkStudentStatus(id) != null) {
			m.addAttribute("mssg", service.checkStudentStatus(id));
			return "displaybookvisitors";
		} else {
			m.addAttribute("mssg", "Student Data Doesn't exits");
			return "bookinput";
		}
	}

	@RequestMapping("/checkStudent")
	public String checkStudent() {
		return "checkstudentstatus";

	}

}
