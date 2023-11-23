package com.bookStore.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookStore.application.entity.MyBookList;


@Repository
public interface MyBookRepository extends JpaRepository<MyBookList, Integer> {

}