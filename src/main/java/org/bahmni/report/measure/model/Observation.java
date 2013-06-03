package org.bahmni.report.measure.model;

import lombok.Data;

@Data
public class Observation {

    private String id;

    private String name;

    private String value;

    private String unit;

    private String comment;

    public Observation() {
    }

    public Observation(String name, String value, String unit, String comment) {
        this.name = name;
        this.value = value;
        this.unit = unit;
        this.comment = comment;
    }

}
