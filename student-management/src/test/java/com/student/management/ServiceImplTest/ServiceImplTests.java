package com.student.management.ServiceImplTest;

import com.student.management.model.Student;
import com.student.management.repository.StudentRepository;
import com.student.management.service.StudentServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ServiceImplTests {

    @Autowired
    StudentServiceImpl studentServiceImpl;



    @Test
    public void  saveStudent(){
        //given
        Student student = Student.builder()
                .name("Rich")
                .email("richa123@gnail.com")
                .age(16)
                .address(null)
                .build();
        //when
        studentServiceImpl.addStudent(student);

        //then
        Assertions.assertThat(student.getId()).isGreaterThan(0);
    }

    @Test
    public void getStudentById(){

        //given
        // when
        Student student =  studentServiceImpl.getStudent(1);

        //then
        Assertions.assertThat(student.getId()).isEqualTo(1);

    }

    @Test
    public void updateStudent(){
        //given
        Student student =  studentServiceImpl.getStudent(1);
        //when
        student.setEmail("richa2345@gmail.com");
        //then
        Assertions.assertThat(student.getEmail()).isEqualTo("richa2345@gmail.com");
    }

}
