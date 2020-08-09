/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.azure.marketplace.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for AllowedCustomerOperationsEnum.
 */
public enum AllowedCustomerOperationsEnum {
    /** Enum value Read. */
    READ("Read"),

    /** Enum value Update. */
    UPDATE("Update"),

    /** Enum value Delete. */
    DELETE("Delete");

    /** The actual serialized value for a AllowedCustomerOperationsEnum instance. */
    private String value;

    AllowedCustomerOperationsEnum(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AllowedCustomerOperationsEnum instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed AllowedCustomerOperationsEnum object, or null if unable to parse.
     */
    @JsonCreator
    public static AllowedCustomerOperationsEnum fromString(String value) {
        AllowedCustomerOperationsEnum[] items = AllowedCustomerOperationsEnum.values();
        for (AllowedCustomerOperationsEnum item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}