package com.adha.dhp.loancalculator.service;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.adha.dhp.loancalculator.entity.Application;
import com.adha.dhp.loancalculator.repository.ApplicationRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {ApplicationServiceImpl.class})
@ExtendWith(SpringExtension.class)
class ApplicationServiceImplTest {
    @MockBean
    private ApplicationRepo applicationRepo;

    @Autowired
    private ApplicationServiceImpl applicationServiceImpl;


    @Test
    void testUpdate() {
        Application application = new Application(1L, 42L, 1L, 10.0d, 1, 3);

        when(applicationRepo.save((Application) any())).thenReturn(application);
        assertSame(application, applicationServiceImpl.update(new Application(1L, 42L, 1L, 10.0d, 1, 3)));
        verify(applicationRepo).save((Application) any());
    }
}

