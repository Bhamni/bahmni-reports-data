package org.bahmni.report.measure.model;

import lombok.Data;

@Data
public class Appointment {

    private String id;

    private AppointmentType appointmentType;

    private String diseaseId;

}
