package com.shehab.demo.reposatory;

import com.shehab.demo.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Task1Repo extends JpaRepository<Teacher,Long> {

}
