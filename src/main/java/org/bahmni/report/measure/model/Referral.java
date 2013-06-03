package org.bahmni.report.measure.model;

import lombok.Data;

@Data
public class Referral {

    private String id;

    private ReferralType referralType;

    private String providerId;

    public Referral() {
    }

    public Referral(ReferralType referralType, String providerId) {
        this.referralType = referralType;
        this.providerId = providerId;
    }

}
