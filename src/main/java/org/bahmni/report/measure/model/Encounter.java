package org.bahmni.report.measure.model;


import lombok.Data;
import org.bahmni.report.dimension.model.EncounterType;

@Data
public class Encounter {

    private String id;

    private String diseaseId;

    private String encounterTypeId;

    public Encounter() {
    }

    public Encounter(String encounterTypeId, String diseaseId) {
        this.encounterTypeId = encounterTypeId;
        this.diseaseId = diseaseId;
    }
}
