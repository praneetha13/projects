package com.library.books.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.books.StudentEntity;
import com.library.books.repository.BookRepository;
import com.library.books.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository repository;
	@Autowired
	BookRepository bookRepository;

	public int addBookVisitorsService(int stu_id, String book_Name) {
		if (bookRepository.existsById(book_Name)) {
			bookRepository.decreaseBookCount(book_Name);
			repository.save(new StudentEntity(stu_id, book_Name));

			return 1;
		}
		return 0;
	}

	public StudentEntity checkStudentStatus(int id) {
		if (repository.existsById(id))
			return repository.findById(id).get();

		return null;

	}

	public int returnBookService(int id, String book_Name) {
		if (repository.existsById(id)) {
			bookRepository.increaseBookCount(book_Name);
			repository.deleteById(id);
			return 1;
		}

		return 0;
	}

}
