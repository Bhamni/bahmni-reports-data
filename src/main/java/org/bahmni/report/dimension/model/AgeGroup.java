package org.bahmni.report.dimension.model;

import lombok.Data;

@Data
public class AgeGroup {

    private String id;

    private Integer minAge;

    private Integer maxAge;

    public AgeGroup() {
    }

    public AgeGroup(Integer minAge, Integer maxAge) {
        this.minAge = minAge;
        this.maxAge = maxAge;
    }

}
