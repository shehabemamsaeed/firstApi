package com.shehab.demo.controller;

import com.shehab.demo.model.Teacher;
import com.shehab.demo.service.Task1ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class Task1Controller {

    @Autowired
    Task1ServiceImpl task1Service;

    @PostMapping("/addTeacher")
    public void addTeacherC(@RequestBody Teacher teacher) {
        task1Service.addTeacher(teacher);
    }

    @PutMapping("/updateTeacher")
    public void updateTeacherC(@RequestBody Teacher teacher) {
        task1Service.UpdateTeacher(teacher);
    }

    @DeleteMapping("/deleteTeacher")
    public String deleteTeacherC(@RequestParam Long id) {
        task1Service.deleteById(id);
        return "Success delete";
    }

    @GetMapping("/getTeacherById")
    public Teacher getTeacherById(@RequestParam("id") Long id ) {
    return task1Service.getTeacherById(id);

    }
    @GetMapping("/getTeachers")
    public List<Teacher> getTeachers(){
        return  task1Service.getTeachers();
    }
}
