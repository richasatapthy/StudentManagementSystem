package com.student.management.mapper;

import com.student.management.dto.StudentDto;
import com.student.management.model.Student;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper
public interface StudentMapper {

    static StudentDto toStudentDto(Student student) {
        return toStudentDto(Student.builder().build());
    }

    Student toStudent(StudentDto studentDto);

    static List<StudentDto> ToStudentDtoS(List<Student> students) {
        return null;
    }

    List<Student> ToStudentS (List<StudentDto> studentDtoS);
}
