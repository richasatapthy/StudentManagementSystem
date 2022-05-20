package com.student.management.service;
import com.student.management.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();
    Student getStudent(int id);
    Student addStudent(Student student);
    Student updateStudent(Student studentDetails);
    void deleteStudent(int id);
}