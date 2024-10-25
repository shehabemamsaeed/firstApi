package com.shehab.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int salary;

    public Teacher() {

    }

    public Long getId() {
        return id;
    }

    public Teacher(String name, int salary) {

        this.name = name;
        this.salary = salary;
    }

    public Teacher(Long id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }



    public String getName() {
        return name;
    }


    public int getSalary() {
        return salary;
    }

}
