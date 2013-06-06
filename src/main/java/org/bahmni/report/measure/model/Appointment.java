package org.bahmni.report.measure.model;

import lombok.Data;

@Data
public class Appointment {

    private String id;

    private Long appointmentTypeId;

    private Long diseaseId;

    private Long appointmentDateId;

    private Long patientGenderId;

    private Long providerId;

    private Long ageId;

    private Long ageGroupId;

    public Appointment() {
    }

    public Appointment(Long appointmentTypeId, Long diseaseId, Long appointmentDateId, Long patientGenderId, Long providerId, Long ageId, Long ageGroupId) {
        this.appointmentTypeId = appointmentTypeId;
        this.diseaseId = diseaseId;
        this.appointmentDateId = appointmentDateId;
        this.patientGenderId = patientGenderId;
        this.providerId = providerId;
        this.ageId = ageId;
        this.ageGroupId = ageGroupId;
    }

}
