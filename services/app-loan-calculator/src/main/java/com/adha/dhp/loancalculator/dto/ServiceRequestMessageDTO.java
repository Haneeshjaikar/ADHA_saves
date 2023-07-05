package com.adha.dhp.loancalculator.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ServiceRequestMessageDTO {

    private Long camundaProcessId;

    private Long applicationNumber;

    private Long loanId;

    private Long personId;

    private String rService;

    private String rType;

    private String rStage;

    private String rStatus;

    // getters and setters
}
