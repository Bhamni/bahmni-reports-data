package org.bahmni.report.measure.model;

import lombok.Data;

@Data
public class Diagnosis {

    private String id;

    private String patientId;

    private String diseaseId;

    private String ageGroupId;

    private String LocationId;

    private DiagnosisStatus diagnosisStatus;

    private DiagnosisType diagnosisType;

}
