package com.shehab.demo.service;

import com.shehab.demo.model.Teacher;
import com.shehab.demo.reposatory.Task1Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Task1ServiceImpl implements  Task1Service{
   @Autowired
    Task1Repo task1Repo;
    @Override
    public void addTeacher(Teacher teacher) {
    Teacher teacher1 = new Teacher(teacher.getName(), teacher.getSalary());
    task1Repo.save(teacher1);
    }

 @Override
 public void UpdateTeacher(Teacher teacher) {
     Teacher teacher1 = new Teacher(teacher.getId(),teacher.getName(), teacher.getSalary());
    task1Repo.save(teacher1);
 }

    @Override
    public void deleteById(Long id) {

        task1Repo.deleteById(id);
    }

    @Override
    public Teacher getTeacherById(Long id) {
       return task1Repo.findById(id).get();
    }

    @Override
    public List<Teacher> getTeachers() {
       return task1Repo.findAll();
    }
}
