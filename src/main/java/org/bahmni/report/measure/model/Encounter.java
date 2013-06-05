package org.bahmni.report.measure.model;


import lombok.Data;

@Data
public class Encounter {

    private String id;

    private EncounterType appointmentType;

    private String diseaseId;

    public Encounter() {
    }

    public Encounter(EncounterType encounterType, String diseaseId) {
        this.appointmentType = encounterType;
        this.diseaseId = diseaseId;
    }
}
