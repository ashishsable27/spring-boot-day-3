package com.example.book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@Autowired
	BookService bookService;

	@Autowired
	Response response;

	@PostMapping("/books")
	public ResponseEntity<Response> add(@RequestBody Book book) {
		System.out.println("Input Request:" + book);
		response.setData(bookService.add(book));
		response.setStatus("success");
		ResponseEntity<Response> responseEntity = new ResponseEntity<Response>(response, HttpStatus.CREATED);

		return responseEntity;
	}

	@GetMapping("/books")
	public List<Book> getAll() {
		return bookService.getAll();
	}

	@GetMapping("/books/{bookId}")
	public ResponseEntity<Response> getById(@PathVariable("bookId") Integer bookId) throws BookNotFoundException {
		
		response.setData(bookService.add(bookService.findById(bookId)));
		response.setStatus("success");
		ResponseEntity<Response> responseEntity = new ResponseEntity<Response>(response, HttpStatus.OK);
		return responseEntity;
	}

	@PutMapping("/books/{bookId}")
	public Book update(@RequestBody Book book, @PathVariable("bookId") Integer bookId) {

		return bookService.update(book, bookId);
	}

	@DeleteMapping("/books/{bookId}")
	public void delete(@PathVariable("bookId") Integer bookId) {

		bookService.delete(bookId);
	}

	@PatchMapping("/books/{bookId}")
	public Book patch(@RequestBody Book book, @PathVariable("bookId") Integer bookId) {

		return bookService.patch(book, bookId);
	}
}
