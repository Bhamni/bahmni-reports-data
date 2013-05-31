package org.bahmni.report.measure.model;

import lombok.Data;

@Data
public class Payment {

    private String id;

    private boolean paid;

    private float amount;

    private float discount;

}
