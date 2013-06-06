package org.bahmni.report.measure.model;

import lombok.Data;

@Data
public class Visit {

    private Long id;

    private VisitType visitType;

    private AdmissionStatus admissionStatus;

    public Visit() {
    }

    public Visit(VisitType visitType, AdmissionStatus admissionStatus) {
        this.visitType = visitType;
        this.admissionStatus = admissionStatus;
    }

}
