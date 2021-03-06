/*
 * Copyright (c) Bosch Software Innovations GmbH 2016-2017.
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
 * Used when a step of the Antenna execution workflow unexpectedly fails.
 */
public class AntennaExecutionException extends RuntimeException {

    private static final long serialVersionUID = -2326543066347264518L;

    public AntennaExecutionException() {
        super();
    }

    public AntennaExecutionException(String message) {
        super(message);
    }

    public AntennaExecutionException(String message, Throwable cause) {
        super(message, cause);
    }
}
