package org.bahmni.report.dimension.model;

import lombok.Data;

@Data
public class Gender {

    private String id;

    private String label;

    public Gender() {
    }

    public Gender(String label) {
        this.label = label;
    }

}
