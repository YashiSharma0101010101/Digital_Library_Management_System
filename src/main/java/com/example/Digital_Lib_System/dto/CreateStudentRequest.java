package com.example.Digital_Lib_System.dto;

import com.example.Digital_Lib_System.Models.Student;
import lombok.*;

import javax.validation.constraints.NotBlank;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateStudentRequest {

    @NotBlank
    private String name;

    @NotBlank
    private String contact;

    // 60 * 60 * 24 * 365 * 1000

    // 31536000000
    public Student to(){
        return Student.builder()
                .name(this.name)
                .contact(this.contact)
                .validity(new Date(System.currentTimeMillis() + 31536000000l)) // 1 year from now
                .build();
    }
}

