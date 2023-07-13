package com.BookProjectWithDB.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BookProjectWithDB.dto.Book;
import com.BookProjectWithDB.service.BookService;



@RestController
public class BookController {

	@Autowired
	BookService bookService;

	@GetMapping("/books")
	public ResponseEntity<List<Book>> handleBooks() {

//		Book b = new Book();
//		b.setId(1);
//		b.setName("Namo Mantra");
//		b.setAuthor("Modi");
//		
//		return b;
		
		List<Book> bookList = bookService.getAllBooks();
//		By this we send status codes as soon as req gets hitted.
		if(bookList.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(bookList)) ;

	}

	@GetMapping("/bookById/{bid}")
	public Book getSingleBook(@PathVariable("bid") int id) {
		System.out.println("Hitted bookById controller ... ");
		Book bb = bookService.getBookById(id);
		return bb;
	}
	
	@PostMapping("/addBook")
	public void addBookHandler(@RequestBody Book book) {
		System.out.println("Book In POST contr");
//		Book book2 = new Book();
//		book2.setId(book.getId());
//		book2.setName(book.getName());
//		book2.setAuthor(book.getAuthor());
		System.out.println(book);
		bookService.addBook(book);
	}
	
	//Id coming from URI from postman
	@DeleteMapping("/deleteBook/{bookId}")
	public void deleteBookHandler(@PathVariable("bookId") int bookId ) {
		bookService.deleteBook(bookId);
	}
	
	//Delete All books from Db
	@DeleteMapping("/deleteAllBooks")
	public void deleteAllBooks() {
		bookService.deleteBooks();
	}
	
	
	
	//Updating book if exist
	
	@PutMapping("/updateBook/{bookId}")
	public void updateHandler(@RequestBody Book book,@PathVariable("bookId") int bookId ) {
		System.out.println(book);
		bookService.updateBook(book,bookId);
	}

}
