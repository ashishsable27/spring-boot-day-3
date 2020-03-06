package com.example.book;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

	// Select * from book where auther="";
	// public List<Book> findByAuther(String auther);

	//JPA queries
//	@Query(value = "select b from Book b  where b.auther=:auther")
//	public List<Book> findByAuther(@Param("auther") String auther);

	
	
}
