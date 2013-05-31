package org.bahmni.report.measure.model;


import lombok.Data;

@Data
public class Encounter {

    private String id;

    private AppointmentType appointmentType;

    private String diseaseId;

}
