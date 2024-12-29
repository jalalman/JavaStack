package com.axsos.login.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.login.model.StuClass;

@Repository
public interface StuClassRepo extends CrudRepository<StuClass, Long> {
    List<StuClass> findAll();
    List<StuClass> findByclassName(String className);

}
