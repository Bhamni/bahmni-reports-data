package org.bahmni.report.measure.model;

import lombok.Data;

@Data
public class Diagnosis {

    private String id;

    private String patientId;

    private String diseaseId;

    private String patientGenderId;

    private String ageId;

    private String ageGroupId;

    private String locationId;

    private DiagnosisStatus diagnosisStatus;

    private DiagnosisType diagnosisType;

    public Diagnosis() {
    }

    public Diagnosis(String patientId, String diseaseId, String patientGenderId, String ageId, String ageGroupId, String locationId, DiagnosisStatus diagnosisStatus, DiagnosisType diagnosisType) {
        this.patientId = patientId;
        this.diseaseId = diseaseId;
        this.patientGenderId = patientGenderId;
        this.ageId = ageId;
        this.ageGroupId = ageGroupId;
        this.locationId = locationId;
        this.diagnosisStatus = diagnosisStatus;
        this.diagnosisType = diagnosisType;
    }

}
