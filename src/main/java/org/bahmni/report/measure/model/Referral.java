package org.bahmni.report.measure.model;

import lombok.Data;

@Data
public class Referral {

    private Long id;

    private ReferralType referralType;

    private Long providerId;

    public Referral() {
    }

    public Referral(ReferralType referralType, Long providerId) {
        this.referralType = referralType;
        this.providerId = providerId;
    }

}
