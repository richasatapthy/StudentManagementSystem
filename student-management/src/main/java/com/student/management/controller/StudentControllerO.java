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

<<<<<<< HEAD

    // private StudentMapper studentMapper;


    @Operation(summary = "get Student details", description = "get a list of Student details", tags = "get")
    @ApiResponse(responseCode = "200", description = "Found the Student", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = Student.class))})
    @GetMapping("/students")
    List<Student> getAllStudents() {

        return studentServiceImpl.getAllStudents();
    }


    @Operation(summary = "get Student details", description = "get a list of particular Student details", tags = "get")
    @ApiResponse(responseCode = "200", description = "Found the Student", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = Student.class))})
    @GetMapping("/students/{id}")
    public Student getStudentById(@Valid @PathVariable("id") int id) throws ResourceNotFoundException {
        Student student = studentServiceImpl.getStudent(id);
        if (student == null) {
            throw new ResourceNotFoundException("Student", "id", id);
        }
        return studentServiceImpl.getStudent(id);
    }


//    @Operation(summary = "insert Student details", description = "Inserting  particular Student details", tags = "post")
//    @ApiResponse(responseCode = "200", description = "Inserted the Student details", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = Student.class))})
//    @PostMapping("/insert")
//    public String addStudent(@RequestBody Student student) {
//        System.out.println(student.toString());
//        Student student1 = studentServiceImpl.addStudent(student);
//        if (student1 == null) {
//            throw new ResourceNotFoundException("Student ", "id", addStudent(student1));
//        }
//        return "Data Inserted successfully";
//
//    }
//    @Operation(summary = "delete Student details", description = "Deleting  particular Student details", tags = "post")
//    @ApiResponse(responseCode = "205", description = "Deleted the Student details", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = Student.class))})
//    @DeleteMapping("/delete{id}")
//    public String deleteStudentById(@PathVariable("studentId")int id){studentServiceImpl.deleteStudent(id);
//        return "Data Deleted successfully";
//
//    }
=======
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
>>>>>>> new_student
}




