package com.axsos.login.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axsos.login.model.StuClass;
import com.axsos.login.repository.StuClassRepo;

@Service
public class StuClassService {
    @Autowired
    private StuClassRepo stuClassRepo;
    public void createClass(StuClass stuClass) {
        stuClassRepo.save(stuClass);
    }
    public List<StuClass> getAllClasses() {
        return stuClassRepo.findAll();
    }
}
