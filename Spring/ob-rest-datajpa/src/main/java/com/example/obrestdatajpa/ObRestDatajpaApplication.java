package com.example.obrestdatajpa;

import com.example.obrestdatajpa.entities.Book;
import com.example.obrestdatajpa.repository.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class ObRestDatajpaApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ObRestDatajpaApplication.class, args);
		BookRepository repository = context.getBean(BookRepository.class);

		// crear libro
		Book book1 = new Book(null, "The Hitchhiker's Guide to the Galaxy", "J.K. Rowling", 450, 29.99, LocalDate.of(2018, 12, 1), true);
		Book book2 = new Book(null, "Harry Potter", "J.K. Rowling", 350, 19.99, LocalDate.of(2013, 12, 1), true);

		// almacenar un libro
		System.out.println("Num libro base de datos: " + repository.findAll().size());

		repository.save(book1);
		repository.save(book2);

		// recuperar todos los libros
		System.out.println("Num libro base de datos: " + repository.findAll().size());

		// borrar un libro
		//repository.deleteById(1L);

		//System.out.println("Num libro base de datos: " + repository.findAll().size());


	}

}
