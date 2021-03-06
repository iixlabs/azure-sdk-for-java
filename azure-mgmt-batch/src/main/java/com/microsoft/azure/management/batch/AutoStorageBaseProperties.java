/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties related to auto storage account.
 */
public class AutoStorageBaseProperties {
    /**
     * The resource ID of the storage account to be used for auto storage
     * account.
     */
    @JsonProperty(required = true)
    private String storageAccountId;

    /**
     * Get the storageAccountId value.
     *
     * @return the storageAccountId value
     */
    public String storageAccountId() {
        return this.storageAccountId;
    }

    /**
     * Set the storageAccountId value.
     *
     * @param storageAccountId the storageAccountId value to set
     * @return the AutoStorageBaseProperties object itself.
     */
    public AutoStorageBaseProperties withStorageAccountId(String storageAccountId) {
        this.storageAccountId = storageAccountId;
        return this;
    }

}
