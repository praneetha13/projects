package com.library.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.library.books.AdminEntity;

import jakarta.transaction.Transactional;

public interface AdminRepository extends JpaRepository<AdminEntity, String> {

    @Modifying
    @Transactional
    @Query(value="UPDATE Admin_Entity a SET a.pswd = :password WHERE a.email = :email",nativeQuery = true)
    int updatePasswordByEmail(@Param("email") String email, @Param("password") String password);
}
