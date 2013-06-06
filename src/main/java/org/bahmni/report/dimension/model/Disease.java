package org.bahmni.report.dimension.model;

import lombok.Data;

@Data
public class Disease {

    private Long id;

    private String name;

    public Disease() {
    }

    public Disease(String name) {
        this.name = name;
    }

}
