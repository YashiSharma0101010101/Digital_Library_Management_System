package com.example.Digital_Lib_System.Repository;

import com.example.Digital_Lib_System.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
