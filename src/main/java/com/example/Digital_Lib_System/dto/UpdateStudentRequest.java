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
public class UpdateStudentRequest {

    @NotBlank
    private String name;

    @NotBlank
    private String contact;

    private Date validity;


    Student to(){
        return Student.builder()
                .name(this.name)
                .contact(this.contact)
                .validity(this.validity)
                .build();
    }
}
