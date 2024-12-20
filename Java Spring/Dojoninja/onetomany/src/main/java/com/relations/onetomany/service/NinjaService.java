package com.relations.onetomany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.relations.onetomany.model.Ninja;
import com.relations.onetomany.repository.NinjaRepository;

@Service
public class NinjaService {
@Autowired
NinjaRepository ninjaRepository;
public void addNinja(Ninja ninja){
    ninjaRepository.save(ninja);
}

public List<Ninja> getAll(){
    return ninjaRepository.findAll();

}
public void create(Ninja ninja){
    ninjaRepository.save(ninja);
}
}
