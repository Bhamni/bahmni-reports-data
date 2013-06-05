package org.bahmni.report.measure.model;

import lombok.Data;
import org.bahmni.report.dimension.model.AppointmentType;

@Data
public class Appointment {

    private String id;

    private String appointmentTypeId;

    private String diseaseId;

    private String appointmentDateId;

    private String patientGenderId;

    private String providerId;

    private String ageId;

    private String ageGroupId;

    public Appointment() {
    }

    public Appointment(String appointmentTypeId, String diseaseId, String appointmentDateId, String patientGenderId, String providerId, String ageId, String ageGroupId) {
        this.appointmentTypeId = appointmentTypeId;
        this.diseaseId = diseaseId;
        this.appointmentDateId = appointmentDateId;
        this.patientGenderId = patientGenderId;
        this.providerId = providerId;
        this.ageId = ageId;
        this.ageGroupId = ageGroupId;
    }

}
