package com.library.books.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.library.books.BookEntity;

import jakarta.transaction.Transactional;

public interface BookRepository extends JpaRepository<BookEntity, String> {
	
	@Modifying
	@Transactional
	@Query(value = "UPDATE book_entity SET book_count = book_count - 1 WHERE book_name = :bookName", nativeQuery = true)
	int decreaseBookCount(@Param("bookName") String bookName);

	
	@Modifying
    @Transactional
    @Query(value = "UPDATE book_entity SET book_count = book_count + 1 WHERE book_name = :bookName", nativeQuery = true)
    void increaseBookCount(@Param("bookName") String bookName);
	@Query("SELECT b FROM BookEntity b")
    List<BookEntity> findAllBooks();
}
