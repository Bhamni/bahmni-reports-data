package org.bahmni.report.dimension.model;

import lombok.Data;

@Data
public class Date {

    private String id;

    private Date date;

    private Integer year;

    private Integer month;

    private Integer week;

    private Integer day;

}
