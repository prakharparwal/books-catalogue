package com.prakhar.parwal.repositories;

import org.springframework.data.repository.CrudRepository;

import com.prakhar.parwal.data.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {

}
