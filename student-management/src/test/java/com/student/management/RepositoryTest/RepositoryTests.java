package com.student.management.RepositoryTest;

import com.student.management.model.Address;
import com.student.management.model.Student;
import com.student.management.repository.StudentRepository;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.BDDAssertions;
import org.hibernate.annotations.OrderBy;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.Order;
import org.springframework.data.repository.query.Param;

@SpringBootTest
public class RepositoryTests {

    @Autowired
    private StudentRepository studentRepository;

//    @Test
//    @Order(3)
//    public void testGetStudentByName()
//    {
//        //given
//        Student Rich = Student.builder()
//                .name("Rima")
//                .email("richa@gmail.com")
//                .age(13)
//                .address(null)
//                .build();
//        Address RichAddress = Address.builder().City("BBS").pinCode(578947).build();
//        Rich.setAddress(RichAddress);
//        Student savedStudent = studentRepository.save(Rich);
//
//        //when
//        Student student = (Student) StudentRepository.getStudentByName("Rima");
//
//        //then
//        Assertions.assertThat(savedStudent.getId()).isNotNull();
//        Assertions.assertThat(student.getName()).isEqualTo("Rima");
//    }

    @Test
    @Order(2)
    public void saveStudent() {
        //given
        Student student = Student.builder()
                .name("Rich")
                .email("richa123@gnail.com")
                .age(15)
                .address(null)
                .build();
        //when
        studentRepository.save(student);

        // then
        Assertions.assertThat(student.getId()).isGreaterThan(0);
    }

    @Test
    @Order(4)
    public void deleteStudent(){
        //given
        Student student = Student.builder()
                .name("Rich")
                .email("richa123@gnail.com")
                .age(14)
                .address(null)
                .build();
        //when
        studentRepository.delete(student);
        //then
        Assertions.assertThat(student.getId()).isEqualTo(0);
    }

    @Test
    public void getStudentTest() {
        //given
        //when
        Student student = studentRepository.findById(1).get();
        //then
        Assertions.assertThat(student.getId()).isEqualTo(1);
    }

}
