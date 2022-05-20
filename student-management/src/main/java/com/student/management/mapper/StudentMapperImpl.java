package com.student.management.mapper;

import com.student.management.dto.StudentDto;
import com.student.management.model.Address;
import com.student.management.model.Student;
import com.student.management.model.Teacher;

import java.util.*;
import java.util.stream.Collectors;

public class StudentMapperImpl {

    public static StudentDto toStudentDto(Student student){
        if(student == null){
            return null;
        }
        return StudentDto.builder()
                .name(student.getName())
                .age(student.getAge())
                .address(student.getAddress())

                .build();
    }

    public static   Student toStudent(StudentDto studentDto){
        if(studentDto==null){
            return null;
        }
        return Student.builder()
                .name(studentDto.getName())
                .age(studentDto.getAge())
                .address(studentDto.getAddress())
                .build();
    }

    public static List<Student> ToStudentDtoS (List<StudentDto> studentDtoList){
        return  studentDtoList.stream().map(a -> toStudent(a)).collect(Collectors.toList());
    }

    public static List<StudentDto> studentDTOs(List<Student> students){
        return students.stream().map(a -> toStudentDto(a)).collect(Collectors.toList());
    }
}



