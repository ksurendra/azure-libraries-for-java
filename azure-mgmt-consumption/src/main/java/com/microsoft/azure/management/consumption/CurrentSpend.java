/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The current amount of cost which is being tracked for a budget.
 */
public class CurrentSpend {
    /**
     * The total amount of cost which is being tracked by the budget.
     */
    @JsonProperty(value = "amount", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal amount;

    /**
     * The unit of measure for the budget amount.
     */
    @JsonProperty(value = "unit", access = JsonProperty.Access.WRITE_ONLY)
    private String unit;

    /**
     * Get the amount value.
     *
     * @return the amount value
     */
    public BigDecimal amount() {
        return this.amount;
    }

    /**
     * Get the unit value.
     *
     * @return the unit value
     */
    public String unit() {
        return this.unit;
    }

}
