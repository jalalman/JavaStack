package com.axsos.savetravels.repository;

import com.axsos.savetravels.model.TravelExp;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TravelExpRepository extends CrudRepository<TravelExp, Integer> {
    List<TravelExp> findAll();
}
