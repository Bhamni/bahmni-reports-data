package org.bahmni.report.measure.model;

import lombok.Data;

@Data
public class Patient {

    private String id;

    private String firstName;

    private String lastName;

    private String ageId;

    private String genderId;

    private String locationId;

    public Patient() {
    }

    public Patient(String firstName, String lastName, String ageId, String genderId, String locationId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ageId = ageId;
        this.genderId = genderId;
        this.locationId = locationId;
    }

}
