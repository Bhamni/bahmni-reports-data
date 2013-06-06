package org.bahmni.report.measure.model;

import lombok.Data;

@Data
public class Order {

    private Long id;

    private OrderType type;

    private String instructions;

    private String orderer;

    private Long startDateId;

    private Long autoExpireDateId;

    public Order() {
    }

    public Order(OrderType type, String instructions, String orderer, Long startDateId, Long autoExpireDateId) {
        this.type = type;
        this.instructions = instructions;
        this.orderer = orderer;
        this.startDateId = startDateId;
        this.autoExpireDateId = autoExpireDateId;
    }

}
