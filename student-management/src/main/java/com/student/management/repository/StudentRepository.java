package com.student.management.repository;

import com.student.management.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>  {
    // @Query(value = "SELECT * FROM Student_Details WHERE name = :Rich",nativeQuery = true)
    // @Transactional(readOnly=true)
    // List<Student> getStudentsByName(@Param("name") String name);

    Student getStudentByName(String name);



}

