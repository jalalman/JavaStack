package com.relations.onetomany.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.relations.onetomany.model.Ninja;
import com.relations.onetomany.model.Dojo;
@Repository
public interface NinjaRepository extends CrudRepository<Ninja,Long> {
    List<Ninja> findAll();
    Ninja findByDojo(Dojo dojo);

}
