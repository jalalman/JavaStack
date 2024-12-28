package com.axsos.shcool.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.shcool.model.StuClass;

@Repository
public interface StuClassRepo extends CrudRepository<StuClass, Long> {
    List<StuClass> findAll();
    List<StuClass> findByclassName(String className);

}
