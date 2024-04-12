package com.example.Digital_Lib_System.Service;

import com.example.Digital_Lib_System.Models.Author;
import com.example.Digital_Lib_System.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    public Author createOrGet(Author author){
        Author authorFromDB = this.authorRepository.findByEmail(author.getEmail());
        if(authorFromDB != null){
            return authorFromDB;
        }

        return this.authorRepository.save(author);
    }

    public List<Author> findAll(){
        return authorRepository.findAll();
    }
}
