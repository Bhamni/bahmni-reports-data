package org.bahmni.report.dimension.model;

import lombok.Data;

@Data
public class Age {

    private int id;

    private int age;

    public Age() {
    }

    public Age(int age) {
        this.age = age;
    }
}
