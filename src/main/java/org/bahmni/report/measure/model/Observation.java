package org.bahmni.report.measure.model;

import lombok.Data;

@Data
public class Observation {

    private String id;

    private String name;

    private String value;

    private String unit;

    private String comment;

}
