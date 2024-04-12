package com.example.Digital_Lib_System.Controller;

import com.example.Digital_Lib_System.Models.Book;
import com.example.Digital_Lib_System.Service.BookService;
import com.example.Digital_Lib_System.dto.BookResponse;
import com.example.Digital_Lib_System.dto.CreateBookRequest;
import com.example.Digital_Lib_System.dto.SearchBookRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("")
    public Book createBook(@RequestBody @Valid CreateBookRequest createBookRequest){
        return bookService.create(createBookRequest);
    }

    @DeleteMapping("/{bookId}")
    public BookResponse deleteBook(@PathVariable("bookId") int bookId){
        try {
            return BookResponse.from(bookService.delete(bookId));
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }

    @GetMapping("/all")
    public List<Book> getAllBooks(){
        return bookService.get();
    }

    // pages < 500
    // author_name , Peter =
    // name  'Programming101' =

    @GetMapping("/search")
    public List<Book> getBooksByAuthor(@RequestBody @Valid SearchBookRequest searchBookRequest) throws Exception {
        return bookService.search(searchBookRequest);
    }
}
