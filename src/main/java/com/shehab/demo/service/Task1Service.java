package com.shehab.demo.service;

import com.shehab.demo.model.Teacher;

import java.util.List;

public interface Task1Service {
     void addTeacher(Teacher teacher);
    void UpdateTeacher(Teacher teacher);

    void deleteById(Long id);

    Teacher getTeacherById(Long id);

    List<Teacher> getTeachers();
}
