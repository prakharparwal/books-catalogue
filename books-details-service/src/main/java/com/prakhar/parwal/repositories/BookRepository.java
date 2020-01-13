package com.prakhar.parwal.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.prakhar.parwal.data.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {

	List<Book> findByName(String name);
}
