package com.studentdrom.drom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentdrom.drom.model.Student;
import com.studentdrom.drom.repository.StudentRepostiory;

@Service
public class StudentService {
    @Autowired
    StudentRepostiory studentRepostiory;
    @Autowired
    DromService dromService;
    public void addStudent(Student student){
        studentRepostiory.save(student);
    }

    public void deleteById(long id)
    {
        studentRepostiory.deleteById(id);
    }
    public List<Student> getAll(){
        return studentRepostiory.findAll();
    }
    public List<Student> excludeById(long id){
        List<Student> dromStudents = dromService.findDromById(id).getStudents();
        List<Student> allStudents = getAll();
        allStudents.removeAll(dromStudents);
        return allStudents;
    }
    
}
