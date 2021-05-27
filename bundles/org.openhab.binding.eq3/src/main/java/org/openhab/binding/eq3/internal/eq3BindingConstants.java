/**
 * Copyright (c) 2010-2021 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.eq3.internal;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.openhab.core.thing.ThingTypeUID;

/**
 * The {@link eq3BindingConstants} class defines common constants, which are
 * used across the whole binding.
 *
 * @author Jens Kolb - Initial contribution
 */
@NonNullByDefault
public class eq3BindingConstants {

    private static final String BINDING_ID = "eq3";

    // List of all Thing Type UIDs
    public static final ThingTypeUID THING_TYPE_EQ3 = new ThingTypeUID(BINDING_ID, "eq3-thermostat");

    // List of all Channel ids
    public static final String CHANNEL_MODE_AUTO = "modeAuto";
    public static final String CHANNEL_TEMPERATURE = "targetTemperature";
}
