package com.bookStore.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.application.entity.MyBookList;
import com.bookStore.application.repository.MyBookRepository;



@Service
public class MyBookListService {
	@Autowired
	private MyBookRepository myBook;

	public void saveMyBook(MyBookList book) {
		myBook.save(book);
	}
	public List<MyBookList>getMyAllBook(){
		return myBook.findAll();
	}
	public void deleteById(int id) {
		myBook.deleteById(id);
	}
}