package org.bahmni.report.measure.model;

import lombok.Data;

@Data
public class Patient {

    private Long id;

    private String firstName;

    private String lastName;

    private Long ageId;

    private Long genderId;

    private Long locationId;

    public Patient() {
    }

    public Patient(String firstName, String lastName, Long ageId, Long genderId, Long locationId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ageId = ageId;
        this.genderId = genderId;
        this.locationId = locationId;
    }

}
