package org.bahmni.report.dimension.model;

import lombok.Data;

@Data
public class AgeGroup {

    private String id;

    private int minAge;

    private int maxAge;

    public AgeGroup() {
    }

    public AgeGroup(int minAge, int maxAge) {
        this.minAge = minAge;
        this.maxAge = maxAge;
    }

}
