package org.bahmni.report.measure.model;


import lombok.Data;

@Data
public class Encounter {

    private String id;

    private AppointmentType appointmentType;

    private String diseaseId;

    public Encounter() {
    }

    public Encounter(AppointmentType appointmentType, String diseaseId) {

        this.appointmentType = appointmentType;
        this.diseaseId = diseaseId;
    }
}
