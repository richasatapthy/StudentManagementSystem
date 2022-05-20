package com.student.management.controller;

import com.student.management.dto.StudentDto;
import com.student.management.exception.ResourceNotFoundException;
import com.student.management.mapper.StudentMapper;
import com.student.management.mapper.StudentMapperImpl;
import com.student.management.model.Student;
import com.student.management.service.StudentService;
import com.student.management.service.StudentServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("/apis")
@Validated
public class StudentControllerDto {
    @Autowired
    StudentService studentService;

    @PostMapping(value = "/createStudent")
    public Student createStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

@GetMapping(value="/student/{id}")
public StudentDto findUserById(@PathVariable("id") int id){
    Student studentData = studentService.getStudent(id);
    return StudentMapperImpl.toStudentDto(studentData);
}

@DeleteMapping(value ="/student{id}")
    public void deleteStudentById(@PathVariable("id")int id){studentService.deleteStudent(id);}
}





//    @Operation(summary = "get Student details", description = "get a list of Student details", tags = "get")
//    @ApiResponse(responseCode = "200", description = "Found the Student", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = Student.class))})
//    @GetMapping("/students")
//    List<Student> getAllStudents() {
//
//        return studentImpl.getAllStudents();
//    }
//
//
//    @Operation(summary = "get Student details", description = "get a list of particular Student details", tags = "get")
//    @ApiResponse(responseCode = "200", description = "Found the Student", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = Student.class))})
//    @GetMapping("/students/{id}")
//    public Student getStudentById(@Valid @PathVariable("id") int id) throws ResourceNotFoundException {
//        Student student = studentServiceImpl.getStudent(id);
//        if (student == null) {
//            throw new ResourceNotFoundException("Student", "id", id);
//        }
//        return studentServiceImpl.getStudent(id);
//    }
//
//
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
//}
//
//
