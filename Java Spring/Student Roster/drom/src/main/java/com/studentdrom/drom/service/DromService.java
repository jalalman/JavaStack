package com.studentdrom.drom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentdrom.drom.model.Drom;
import com.studentdrom.drom.model.Student;
import com.studentdrom.drom.repository.DromRepository;

@Service
public class DromService {
    @Autowired
    DromRepository dromRepository;

    public void addDrom(Drom drom){
        dromRepository.save(drom);
    }
    public List<Drom> getAll(){
        return dromRepository.findAll();
    }
    public Drom findDromById(long id){
        Optional<Drom> optionalDrom=dromRepository.findById(id);
        if(optionalDrom.isPresent()){
            return optionalDrom.get();
        }
        return null;
    }
   
}
