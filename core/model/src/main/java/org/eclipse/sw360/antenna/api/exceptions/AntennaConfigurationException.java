/*
 * Copyright (c) Bosch Software Innovations GmbH 2017.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.sw360.antenna.api.exceptions;

/**
 * Used when the Antenna workflow configuration unexpectedly fails.
 */
public class AntennaConfigurationException extends AntennaException {

    private static final long serialVersionUID = 7171915096651884386L;

    public AntennaConfigurationException() {
        super();
    }

    public AntennaConfigurationException(String message) {
        super(message);
    }

    public AntennaConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }
}
