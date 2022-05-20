package com.student.management.service;

import com.student.management.model.Teacher;
import com.student.management.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeacherServiceImpl implements  TeacherService{

    @Autowired
    TeacherRepository teacherRepository;
    @Override
    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    @Override
    public Teacher getTeacherById(int id) {
        return teacherRepository.getById(id);
    }

    @Override
    public Teacher addTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }
}
