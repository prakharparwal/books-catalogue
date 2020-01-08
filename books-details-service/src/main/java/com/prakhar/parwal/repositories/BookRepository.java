package com.prakhar.parwal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prakhar.parwal.data.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
