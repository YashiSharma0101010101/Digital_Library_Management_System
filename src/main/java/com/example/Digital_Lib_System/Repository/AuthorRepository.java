package com.example.Digital_Lib_System.Repository;

import com.example.Digital_Lib_System.Models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

    // select * from author where email = ?
    Author findByEmail(String email);
}