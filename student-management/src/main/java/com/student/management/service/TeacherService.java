package com.student.management.service;

import com.student.management.model.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> getAllTeachers();
    Teacher getTeacherById(int id);
    Teacher addTeacher(Teacher teacher);
}