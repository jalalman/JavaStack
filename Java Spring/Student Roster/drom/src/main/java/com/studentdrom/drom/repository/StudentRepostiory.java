package com.studentdrom.drom.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.studentdrom.drom.model.Student;
@Repository
public interface StudentRepostiory extends CrudRepository<Student,Long> {
    List<Student> findAll();
}
