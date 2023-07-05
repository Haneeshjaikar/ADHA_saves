package com.adha.dhp.loancalculator.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "SERVICE_REQUEST")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ServiceRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "my_sequence")
//    @SequenceGenerator(name = "my_sequence", sequenceName = "ISEQ$$_120152", allocationSize = 1)
    @Column(name = "SERVICE_REQUEST_NUMBER")
    private Long serviceRequestNumber;

    @Column(name = "CAMUNDA_PROCESS_ID")
    private Long camundaProcessId;

    @Column(name = "APPLICATION_NUMBER")
    private Long applicationNumber;

    @Column(name = "LOAN_ID")
    private Long loanId;

    @Column(name = "PERSON_ID")
    private Long personId;

    @Column(name = "UPDATED_BY")
    private String updatedBy;

    ///////////////////////////////////////////////

    @Column(name = "R_SERVICE")
    private String rService;

    @Column(name = "R_TYPE")
    private String rType;

    @Column(name = "R_STAGE")
    private String rStage;

    @Column(name = "R_STATUS")
    private String rStatus;
    
}
