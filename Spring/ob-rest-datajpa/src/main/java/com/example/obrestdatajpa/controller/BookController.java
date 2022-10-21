package com.example.obrestdatajpa.controller;

import com.example.obrestdatajpa.entities.Book;
import com.example.obrestdatajpa.repository.BookRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    // atributos
    private BookRepository bookRepository;
    // constructores
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // CRUD sobre la entidad Book

    // Buscar todos los libros (lista de libros)

    /**
     * Request
     * Response
     * @Param id
     * @return
     */
    @GetMapping("/api/books")
    public List<Book> findAll(){
        // recuperar y devolver los libros en base de datos
        return bookRepository.findAll();
    }

    // Buscar un solo libro en base de datos según su id
    @GetMapping("/api/books/{id}")
    public ResponseEntity<Book> findById(@PathVariable Long id){
        // opcion 1
       Optional<Book> bookOpt = bookRepository.findById(id);
        if (bookOpt.isPresent()) {
            return ResponseEntity.ok(bookOpt.get());
        }   else return ResponseEntity.notFound().build();

        // opcion 2
       // return bookOpt.orElse(null);
    }
    // recuperar los datos en base de libros
 //   findOneById(Long id){

  //  }
    // Crear un nuevo libro en base de datos
    @PostMapping("/api/books")
    public Book create(@RequestBody Book book, @RequestHeader HttpHeaders headers){
        System.out.println(headers.get("User-Agent"));
        // guardar el libro recibido por parámetro en la base de datos
        return bookRepository.save(book);
    }

    // actualizar un libro existente en base de datos

    // borrar un libro en base de datos
}
