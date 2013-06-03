package org.bahmni.report.measure.model;

import lombok.Data;

@Data
public class Appointment {

    private String id;

    private AppointmentType appointmentType;

    private String diseaseId;

    public Appointment() {
    }

    public Appointment(AppointmentType appointmentType, String diseaseId) {
        this.appointmentType = appointmentType;
        this.diseaseId = diseaseId;
    }

}
