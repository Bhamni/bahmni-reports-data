package org.bahmni.report.dimension.model;

import lombok.Data;

@Data
public class Provider {

    private String id;

    private ProviderType providerType;

    public Provider() {
    }

    public Provider(ProviderType providerType) {
        this.providerType = providerType;
    }

}
