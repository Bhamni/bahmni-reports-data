package org.bahmni.report.measure.model;

import lombok.Data;

@Data
public class Order {

    private String id;

    private String type;

    private String name;

    public Order() {
    }

    public Order(String type, String name) {
        this.type = type;
        this.name = name;
    }

}
