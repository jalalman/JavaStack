package com.studentdrom.drom.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.studentdrom.drom.model.Drom;

@Repository
public interface DromRepository extends CrudRepository<Drom,Long>{
    List<Drom> findAll();

}
