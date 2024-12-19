package com.axsos.savetravels.service;

import com.axsos.savetravels.model.TravelExp;
import com.axsos.savetravels.repository.TravelExpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TravelExpService {
    @Autowired
    TravelExpRepository travelExpRepository;
    public List<TravelExp> getAllTravelExp() {
        return travelExpRepository.findAll();
    }

    public TravelExp getTravelExpById(int id) {
        Optional<TravelExp> optionalTravelExp= travelExpRepository.findById(id);
        if(optionalTravelExp.isPresent()){
            return optionalTravelExp.get();
        }
        return null;
    }
    public void createTravelExp(TravelExp travelExp) {
        travelExpRepository.save(travelExp);
    }
    public void updateTravelExp(TravelExp travelExp) {
        travelExpRepository.save(travelExp);
    }
    public void deleteTravelExp(int id) {
        travelExpRepository.deleteById(id);
    }
}
