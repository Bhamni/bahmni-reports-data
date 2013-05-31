package org.bahmni.report.measure.model;

import lombok.Data;

@Data
public class Referral {

    private String id;

    private ReferralType referralType;

    private String providerId;

}
