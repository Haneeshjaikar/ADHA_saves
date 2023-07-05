package com.adha.dhp.loancalculator.service;

import com.adha.dhp.loancalculator.entity.Application;
import com.adha.dhp.loancalculator.repository.ApplicationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationServiceImpl implements ApplicationService {
    @Autowired
    private ApplicationRepo applicationRepo;

    @Override
    public Application update(Application application) {

        return applicationRepo.save(application);
    }
}
