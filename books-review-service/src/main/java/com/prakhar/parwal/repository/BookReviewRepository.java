package com.prakhar.parwal.repository;

import org.springframework.data.repository.CrudRepository;

import com.prakhar.parwal.data.BookReviewData;

public interface BookReviewRepository extends CrudRepository<BookReviewData, Integer>  {

}
