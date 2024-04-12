package com.example.Digital_Lib_System.Repository;

import com.example.Digital_Lib_System.Models.Book;
import com.example.Digital_Lib_System.Models.Enums.TransactionStatus;
import com.example.Digital_Lib_System.Models.Enums.TransactionType;
import com.example.Digital_Lib_System.Models.Student;
import com.example.Digital_Lib_System.Models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {


    Transaction findTopByStudentAndBookAndTransactionTypeAndTransactionStatusOrderByTransactionTimeDesc(
            Student student, Book book, TransactionType transactionType, TransactionStatus transactionStatus
    );
}
