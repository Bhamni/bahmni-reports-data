package org.bahmni.report.measure.model;

import lombok.Data;

@Data
public class Order {

    private String id;

    private OrderType type;

    private String instructions;

    private String orderer;

    private String startDateId;

    private String autoExpireDateId;

    public Order() {
    }

    public Order(OrderType type, String instructions, String orderer, String startDateId, String autoExpireDateId) {
        this.type = type;
        this.instructions = instructions;
        this.orderer = orderer;
        this.startDateId = startDateId;
        this.autoExpireDateId = autoExpireDateId;
    }

}
