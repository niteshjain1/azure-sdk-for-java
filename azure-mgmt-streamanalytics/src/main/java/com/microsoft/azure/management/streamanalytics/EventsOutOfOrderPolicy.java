/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for EventsOutOfOrderPolicy.
 */
public final class EventsOutOfOrderPolicy {
    /** Static value Adjust for EventsOutOfOrderPolicy. */
    public static final EventsOutOfOrderPolicy ADJUST = new EventsOutOfOrderPolicy("Adjust");

    /** Static value Drop for EventsOutOfOrderPolicy. */
    public static final EventsOutOfOrderPolicy DROP = new EventsOutOfOrderPolicy("Drop");

    private String value;

    /**
     * Creates a custom value for EventsOutOfOrderPolicy.
     * @param value the custom value
     */
    public EventsOutOfOrderPolicy(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof EventsOutOfOrderPolicy)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        EventsOutOfOrderPolicy rhs = (EventsOutOfOrderPolicy) obj;
        if (value == null) {
            return rhs.value == null;
        } else {
            return value.equals(rhs.value);
        }
    }
}
