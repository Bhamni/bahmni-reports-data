package org.bahmni.report.dimension.model;

import lombok.Data;

@Data
public class Location {

    private Long id;

    private String name;

    private Level level;

    public Location() {
    }

    public Location(String name, Level level) {
        this.name = name;
        this.level = level;
    }

}
