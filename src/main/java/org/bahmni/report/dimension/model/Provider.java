package org.bahmni.report.dimension.model;

import lombok.Data;

@Data
public class Provider {

    private Long id;

    private String name;

    public Provider() {
    }

    public Provider(String name) {
        this.name = name;
    }

}
