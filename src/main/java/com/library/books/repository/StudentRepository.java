package com.library.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.library.books.StudentEntity;

import jakarta.transaction.Transactional;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer>{
	
}

