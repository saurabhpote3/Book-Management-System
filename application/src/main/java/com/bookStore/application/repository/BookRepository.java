package com.bookStore.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookStore.application.entity.Book;


@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

	
	
}