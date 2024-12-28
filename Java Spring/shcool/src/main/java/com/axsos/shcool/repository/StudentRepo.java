package com.axsos.shcool.repository;
import com.axsos.shcool.model.StuClass;
import com.axsos.shcool.model.Student;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends CrudRepository<Student, Long> {
    List<Student> findAll();
    List<Student> findByName(String name);
    List<Student> findByAge(String age);
    List<Student> findByGrade(String grade);
    List<Student> findByStuClass(StuClass stuClass);

}
