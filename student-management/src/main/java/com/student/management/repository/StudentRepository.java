package com.student.management.repository;

import com.student.management.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>  {
     @Query(value = "SELECT * FROM student_details s WHERE s.name = :name", nativeQuery = true)
     List<Student> FindByName(@Param("name") String name);

     @Query(value = "SELECT * FROM student_details s WHERE s.age = :age", nativeQuery = true)
     List<Student> FindByAge(@Param("age") int age);

     // Student getStudentByName(String name);



}

