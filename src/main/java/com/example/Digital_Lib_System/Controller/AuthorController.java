package com.example.Digital_Lib_System.Controller;

import com.example.Digital_Lib_System.Models.Author;
import com.example.Digital_Lib_System.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @GetMapping("/author/all")
    public List<Author> getAuthors(){
        return authorService.findAll();
    }
}
