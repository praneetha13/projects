package com.library.books.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.books.BookEntity;
import com.library.books.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	BookRepository bookRepository;

	public List<BookEntity> getBook() {
		return bookRepository.findAll();
	}

	public int addBookService(BookEntity bookEntity) {
		if (bookRepository.save(bookEntity) != null)
			return 1;
		return 0;
	}

	public BookEntity findByBookService(String bookName) {
		Optional<BookEntity> optionalBook = bookRepository.findById(bookName);

		return optionalBook.orElse(null);
	}

}
