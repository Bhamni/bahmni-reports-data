package org.bahmni.report.dimension.model;

import lombok.Data;

@Data
public class AgeGroup {

    private Long id;

    private Integer minAge;

    private Integer maxAge;

    public AgeGroup() {
    }

    public AgeGroup(Integer minAge, Integer maxAge) {
        this.minAge = minAge;
        this.maxAge = maxAge;
    }

}
