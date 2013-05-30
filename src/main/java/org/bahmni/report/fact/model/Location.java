package org.bahmni.report.fact.model;

import lombok.Data;

@Data
public class Location {

    private String id;
    private String name;

    public Location() {
    }

    public Location(String name) {
        this.name = name;
    }

}
