package org.bahmni.report.measure.model;

import lombok.Data;

@Data
public class Visit {

    private String id;

    private VisitType visitType;

    private AdmissionStatus admissionStatus;
}
