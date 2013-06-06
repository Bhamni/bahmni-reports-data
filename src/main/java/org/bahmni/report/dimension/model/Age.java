package org.bahmni.report.dimension.model;

import lombok.Data;

@Data
public class Age {

    private Long id;

    private Integer age;

    public Age() {
    }

    public Age(Integer age) {
        this.age = age;
    }
}
