package org.bahmni.report.measure.model;


import lombok.Data;
import org.bahmni.report.dimension.model.EncounterType;

@Data
public class Encounter {

    private Long id;

    private Long diseaseId;

    private Long encounterTypeId;

    public Encounter() {
    }

    public Encounter(Long encounterTypeId, Long diseaseId) {
        this.encounterTypeId = encounterTypeId;
        this.diseaseId = diseaseId;
    }
}
