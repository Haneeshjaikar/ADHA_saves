//package com.adha.dhp.loancalculator.listener;
//
//import static org.mockito.Mockito.any;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//import com.adha.dhp.loancalculator.dto.LoanEntitlement;
//import com.adha.dhp.loancalculator.entity.Application;
//import com.adha.dhp.loancalculator.service.ApplicationServiceImpl;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//
//@ContextConfiguration(classes = {MessageListener.class})
//@ExtendWith(SpringExtension.class)
//class MessageListenerTest {
//    @MockBean
//    private ApplicationServiceImpl applicationServiceImpl;
//
//    @Autowired
//    private MessageListener messageListener;
//
//    @MockBean
//    private ObjectMapper objectMapper;
//
//
// //   @Test
//    void testHandleMessage() throws JsonProcessingException {
//        when(applicationServiceImpl.update((Application) any())).thenReturn(new Application(1L, 42L, 1L, 10.0d, 1, 3));
//        when(objectMapper.readValue((String) any(), (Class<Application>) any()))
//                .thenReturn(new Application(1L, 42L, 1L, 10.0d, 1, 3));
//        when(objectMapper.writeValueAsString((Object) any())).thenReturn("42");
//
//        LoanEntitlement loanEntitlement = new LoanEntitlement();
//        loanEntitlement.setApplicationNumber(1L);
//        loanEntitlement.setEntitledLoanValue(42L);
//        loanEntitlement.setExpectedMonthlyInstallment(10.0d);
//        loanEntitlement.setExpectedRepayableLoanAmount(1L);
//        loanEntitlement.setMaxExpectedTenure(3);
//        loanEntitlement.setMinExpectedTenure(1);
//        messageListener.handleMessage(loanEntitlement);
//        verify(applicationServiceImpl).update((Application) any());
//        verify(objectMapper).readValue((String) any(), (Class<Application>) any());
//        verify(objectMapper).writeValueAsString((Object) any());
//    }
//
//}
//
