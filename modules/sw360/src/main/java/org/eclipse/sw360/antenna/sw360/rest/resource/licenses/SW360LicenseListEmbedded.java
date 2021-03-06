/*
 * Copyright (c) Bosch Software Innovations GmbH 2018.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.sw360.antenna.sw360.rest.resource.licenses;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.eclipse.sw360.antenna.sw360.rest.resource.Embedded;

import java.util.List;

@JsonDeserialize(as = SW360LicenseListEmbedded.class)
public class SW360LicenseListEmbedded implements Embedded {
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("sw360:licenses")
    private List<SW360SparseLicense> licenses;

    public List<SW360SparseLicense> getLicenses() { return this.licenses; }

    public SW360LicenseListEmbedded setLicenses(List<SW360SparseLicense> licenses) {
        this.licenses = licenses;
        return this;
    }
}
