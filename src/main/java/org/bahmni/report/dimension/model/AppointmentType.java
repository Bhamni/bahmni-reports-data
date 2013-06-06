package org.bahmni.report.dimension.model;

import lombok.Data;

@Data
public class AppointmentType {

    private Long id;

    private String type;

    public AppointmentType() {}

    public AppointmentType(String type) {
        this.type = type;
    }

}
