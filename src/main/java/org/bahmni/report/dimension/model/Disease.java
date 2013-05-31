package org.bahmni.report.dimension.model;

import lombok.Data;

@Data
public class Disease {

    private String id;

    private String name;

    public Disease() {
    }

    public Disease(String name) {
        this.name = name;
    }

}
