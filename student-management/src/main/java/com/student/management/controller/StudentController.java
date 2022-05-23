package com.student.management.controller;


import com.student.management.exception.ResourceNotFoundException;
import com.student.management.model.Student;
import com.student.management.service.StudentServiceImpl;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
@Validated
public class StudentController {
    @Autowired
    StudentServiceImpl studentServiceImpl;

    @Operation(summary = "insert Student details", description = "Inserting  particular Student details", tags = "post")
    @ApiResponse(responseCode = "201", description = "Inserted the Student details", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = Student.class))})
    @PostMapping("/insert")
    public String addStudent(@RequestBody Student student) {
        System.out.println(student.toString());
        Student student1 = studentServiceImpl.addStudent(student);
        if (student1 == null) {
            throw new ResourceNotFoundException("Student ", "id", addStudent(student1));
        }
        return "Data Inserted successfully";

    }
}




