package org.bahmni.report.measure.model;

import lombok.Data;

@Data
public class Diagnosis {

    private String id;

    private Long patientId;

    private Long diseaseId;

    private Long patientGenderId;

    private Long ageId;

    private Long ageGroupId;

    private Long locationId;

    private DiagnosisStatus diagnosisStatus;

    private DiagnosisType diagnosisType;

    public Diagnosis() {
    }

    public Diagnosis(Long patientId, Long diseaseId, Long patientGenderId, Long ageId, Long ageGroupId, Long locationId, DiagnosisStatus diagnosisStatus, DiagnosisType diagnosisType) {
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
