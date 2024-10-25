package com.shehab.demo.service;

import com.shehab.demo.model.Teacher;
import org.springframework.stereotype.Service;

import java.util.List;

public interface Task1Service {
    public void addTeacher(Teacher teacher);
    void UpdateTeacher(Teacher teacher);

    void deleteById(Long id);

    Teacher getTeacherById(Long id);

    List<Teacher> getTeachers();
}
