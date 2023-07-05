package com.adha.dhp.loancalculator.service;

import com.adha.dhp.loancalculator.entity.ServiceRequest;
import com.adha.dhp.loancalculator.repository.ServiceRequestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceRequestService {
    @Autowired
    private ServiceRequestRepo serviceRequestRepo;

    public ServiceRequest update(ServiceRequest serviceRequest) {

        return serviceRequestRepo.save(serviceRequest);
    }
}
