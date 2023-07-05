package com.adha.dhp.loancalculator.repository;

import com.adha.dhp.loancalculator.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepo extends JpaRepository<Application, String> {
}
