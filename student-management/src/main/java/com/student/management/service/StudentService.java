package com.student.management.service;
import com.student.management.model.Student;
import org.springframework.data.domain.Page;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();
    Student getStudent(int id);
    Student addStudent(Student student);
    Student updateStudent(Student studentDetails);
    void deleteStudent(int id);
   // public List<Student> findProductsWithSorting(String field);
    public Page<Student> findStudentsWithPagination(int offset, int pageSize);
   // public Page<Student> findProductsWithPaginationAndSorting(int offset,int pageSize,String field);
}