package org.bahmni.report.measure.model;

import lombok.Data;

@Data
public class Appointment {

    private String id;

    private AppointmentType appointmentType;

    private String diseaseId;

    private String appointmentDateId;

    private String patientGenderId;

    private String providerId;

    private String ageId;

    private String ageGroupId;

    public Appointment() {
    }

    public Appointment(AppointmentType appointmentType, String diseaseId, String appointmentDateId, String patientGenderId, String providerId, String ageId, String ageGroupId) {
        this.appointmentType = appointmentType;
        this.diseaseId = diseaseId;
        this.appointmentDateId = appointmentDateId;
        this.patientGenderId = patientGenderId;
        this.providerId = providerId;
        this.ageId = ageId;
        this.ageGroupId = ageGroupId;
    }

}
