package org.bahmni.report.dimension.model;


import lombok.Data;
import org.joda.time.DateTime;

import java.sql.Date;

@Data
public class DateDimension {

    private String id;

    private Date date;

    private Integer year;

    private Integer month;

    private Integer week;

    private Integer day;

    public DateDimension() {
    }

    public DateDimension(java.util.Date date) {
        this.date = new java.sql.Date(date.getTime());

        DateTime dateTime = new DateTime(date);
        this.year = dateTime.getYear();
        this.month = dateTime.getMonthOfYear();
        this.week = dateTime.getWeekOfWeekyear();
        this.day = dateTime.getDayOfMonth();
    }

}
