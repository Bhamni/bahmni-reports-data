package org.bahmni.report.measure.model;

import lombok.Data;

@Data
public class Observation {

    private Long id;

    private String name;

    private String value;

    private String unit;

    private String comment;

    private Long locationId;

    private Long observationDateId;

    public Observation() {
    }

    public Observation(String name, String value, String unit, String comment, Long locationId, Long observationDateId) {
        this.name = name;
        this.value = value;
        this.unit = unit;
        this.comment = comment;
        this.locationId = locationId;
        this.observationDateId = observationDateId;
    }

}
