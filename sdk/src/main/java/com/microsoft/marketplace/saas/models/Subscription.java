// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.microsoft.marketplace.saas.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.UUID;

/** The Subscription model. */
@Fluent
public final class Subscription {
    /*
     * The id property.
     */
    @JsonProperty(value = "id")
    private UUID id;

    /*
     * The publisherId property.
     */
    @JsonProperty(value = "publisherId")
    private String publisherId;

    /*
     * The offerId property.
     */
    @JsonProperty(value = "offerId")
    private String offerId;

    /*
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Indicates the status of the operation.
     */
    @JsonProperty(value = "saasSubscriptionStatus")
    private SubscriptionStatusEnum saasSubscriptionStatus;

    /*
     * The beneficiary property.
     */
    @JsonProperty(value = "beneficiary")
    private AadIdentifier beneficiary;

    /*
     * The purchaser property.
     */
    @JsonProperty(value = "purchaser")
    private AadIdentifier purchaser;

    /*
     * The planId property.
     */
    @JsonProperty(value = "planId")
    private String planId;

    /*
     * The quantity property.
     */
    @JsonProperty(value = "quantity")
    private Integer quantity;

    /*
     * The term property.
     */
    @JsonProperty(value = "term")
    private SubscriptionTerm term;

    /*
     * Indicating whether the current subscription is a test asset.
     */
    @JsonProperty(value = "isTest")
    private Boolean isTest;

    /*
     * true - the customer subscription is currently in free trial, false - the
     * customer subscription is not currently in free trial.(optional field -
     * default false)
     */
    @JsonProperty(value = "isFreeTrial")
    private Boolean isFreeTrial;

    /*
     * The allowedCustomerOperations property.
     */
    @JsonProperty(value = "allowedCustomerOperations")
    private List<AllowedCustomerOperationsEnum> allowedCustomerOperations;

    /*
     * The sessionId property.
     */
    @JsonProperty(value = "sessionId")
    private UUID sessionId;

    /*
     * The fulfillmentId property.
     */
    @JsonProperty(value = "fulfillmentId")
    private UUID fulfillmentId;

    /*
     * The storeFront property.
     */
    @JsonProperty(value = "storeFront")
    private String storeFront;

    /*
     * Dry Run indicates all transactions run as Test-Mode in the commerce
     * stack
     */
    @JsonProperty(value = "sessionMode")
    private SessionModeEnum sessionMode;

    /*
     * Possible Values are None, Csp (Csp sandbox purchase)
     */
    @JsonProperty(value = "sandboxType")
    private SandboxTypeEnum sandboxType;

    /**
     * Get the id property: The id property.
     *
     * @return the id value.
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Set the id property: The id property.
     *
     * @param id the id value to set.
     * @return the Subscription object itself.
     */
    public Subscription setId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Get the publisherId property: The publisherId property.
     *
     * @return the publisherId value.
     */
    public String getPublisherId() {
        return this.publisherId;
    }

    /**
     * Set the publisherId property: The publisherId property.
     *
     * @param publisherId the publisherId value to set.
     * @return the Subscription object itself.
     */
    public Subscription setPublisherId(String publisherId) {
        this.publisherId = publisherId;
        return this;
    }

    /**
     * Get the offerId property: The offerId property.
     *
     * @return the offerId value.
     */
    public String getOfferId() {
        return this.offerId;
    }

    /**
     * Set the offerId property: The offerId property.
     *
     * @param offerId the offerId value to set.
     * @return the Subscription object itself.
     */
    public Subscription setOfferId(String offerId) {
        this.offerId = offerId;
        return this;
    }

    /**
     * Get the name property: The name property.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     *
     * @param name the name value to set.
     * @return the Subscription object itself.
     */
    public Subscription setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the saasSubscriptionStatus property: Indicates the status of the operation.
     *
     * @return the saasSubscriptionStatus value.
     */
    public SubscriptionStatusEnum getSaasSubscriptionStatus() {
        return this.saasSubscriptionStatus;
    }

    /**
     * Set the saasSubscriptionStatus property: Indicates the status of the operation.
     *
     * @param saasSubscriptionStatus the saasSubscriptionStatus value to set.
     * @return the Subscription object itself.
     */
    public Subscription setSaasSubscriptionStatus(SubscriptionStatusEnum saasSubscriptionStatus) {
        this.saasSubscriptionStatus = saasSubscriptionStatus;
        return this;
    }

    /**
     * Get the beneficiary property: The beneficiary property.
     *
     * @return the beneficiary value.
     */
    public AadIdentifier getBeneficiary() {
        return this.beneficiary;
    }

    /**
     * Set the beneficiary property: The beneficiary property.
     *
     * @param beneficiary the beneficiary value to set.
     * @return the Subscription object itself.
     */
    public Subscription setBeneficiary(AadIdentifier beneficiary) {
        this.beneficiary = beneficiary;
        return this;
    }

    /**
     * Get the purchaser property: The purchaser property.
     *
     * @return the purchaser value.
     */
    public AadIdentifier getPurchaser() {
        return this.purchaser;
    }

    /**
     * Set the purchaser property: The purchaser property.
     *
     * @param purchaser the purchaser value to set.
     * @return the Subscription object itself.
     */
    public Subscription setPurchaser(AadIdentifier purchaser) {
        this.purchaser = purchaser;
        return this;
    }

    /**
     * Get the planId property: The planId property.
     *
     * @return the planId value.
     */
    public String getPlanId() {
        return this.planId;
    }

    /**
     * Set the planId property: The planId property.
     *
     * @param planId the planId value to set.
     * @return the Subscription object itself.
     */
    public Subscription setPlanId(String planId) {
        this.planId = planId;
        return this;
    }

    /**
     * Get the quantity property: The quantity property.
     *
     * @return the quantity value.
     */
    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * Set the quantity property: The quantity property.
     *
     * @param quantity the quantity value to set.
     * @return the Subscription object itself.
     */
    public Subscription setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Get the term property: The term property.
     *
     * @return the term value.
     */
    public SubscriptionTerm getTerm() {
        return this.term;
    }

    /**
     * Set the term property: The term property.
     *
     * @param term the term value to set.
     * @return the Subscription object itself.
     */
    public Subscription setTerm(SubscriptionTerm term) {
        this.term = term;
        return this;
    }

    /**
     * Get the isTest property: Indicating whether the current subscription is a test asset.
     *
     * @return the isTest value.
     */
    public Boolean isTest() {
        return this.isTest;
    }

    /**
     * Set the isTest property: Indicating whether the current subscription is a test asset.
     *
     * @param isTest the isTest value to set.
     * @return the Subscription object itself.
     */
    public Subscription setIsTest(Boolean isTest) {
        this.isTest = isTest;
        return this;
    }

    /**
     * Get the isFreeTrial property: true - the customer subscription is currently in free trial, false - the customer
     * subscription is not currently in free trial.(optional field - default false).
     *
     * @return the isFreeTrial value.
     */
    public Boolean isFreeTrial() {
        return this.isFreeTrial;
    }

    /**
     * Set the isFreeTrial property: true - the customer subscription is currently in free trial, false - the customer
     * subscription is not currently in free trial.(optional field - default false).
     *
     * @param isFreeTrial the isFreeTrial value to set.
     * @return the Subscription object itself.
     */
    public Subscription setIsFreeTrial(Boolean isFreeTrial) {
        this.isFreeTrial = isFreeTrial;
        return this;
    }

    /**
     * Get the allowedCustomerOperations property: The allowedCustomerOperations property.
     *
     * @return the allowedCustomerOperations value.
     */
    public List<AllowedCustomerOperationsEnum> getAllowedCustomerOperations() {
        return this.allowedCustomerOperations;
    }

    /**
     * Set the allowedCustomerOperations property: The allowedCustomerOperations property.
     *
     * @param allowedCustomerOperations the allowedCustomerOperations value to set.
     * @return the Subscription object itself.
     */
    public Subscription setAllowedCustomerOperations(List<AllowedCustomerOperationsEnum> allowedCustomerOperations) {
        this.allowedCustomerOperations = allowedCustomerOperations;
        return this;
    }

    /**
     * Get the sessionId property: The sessionId property.
     *
     * @return the sessionId value.
     */
    public UUID getSessionId() {
        return this.sessionId;
    }

    /**
     * Set the sessionId property: The sessionId property.
     *
     * @param sessionId the sessionId value to set.
     * @return the Subscription object itself.
     */
    public Subscription setSessionId(UUID sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * Get the fulfillmentId property: The fulfillmentId property.
     *
     * @return the fulfillmentId value.
     */
    public UUID getFulfillmentId() {
        return this.fulfillmentId;
    }

    /**
     * Set the fulfillmentId property: The fulfillmentId property.
     *
     * @param fulfillmentId the fulfillmentId value to set.
     * @return the Subscription object itself.
     */
    public Subscription setFulfillmentId(UUID fulfillmentId) {
        this.fulfillmentId = fulfillmentId;
        return this;
    }

    /**
     * Get the storeFront property: The storeFront property.
     *
     * @return the storeFront value.
     */
    public String getStoreFront() {
        return this.storeFront;
    }

    /**
     * Set the storeFront property: The storeFront property.
     *
     * @param storeFront the storeFront value to set.
     * @return the Subscription object itself.
     */
    public Subscription setStoreFront(String storeFront) {
        this.storeFront = storeFront;
        return this;
    }

    /**
     * Get the sessionMode property: Dry Run indicates all transactions run as Test-Mode in the commerce stack.
     *
     * @return the sessionMode value.
     */
    public SessionModeEnum getSessionMode() {
        return this.sessionMode;
    }

    /**
     * Set the sessionMode property: Dry Run indicates all transactions run as Test-Mode in the commerce stack.
     *
     * @param sessionMode the sessionMode value to set.
     * @return the Subscription object itself.
     */
    public Subscription setSessionMode(SessionModeEnum sessionMode) {
        this.sessionMode = sessionMode;
        return this;
    }

    /**
     * Get the sandboxType property: Possible Values are None, Csp (Csp sandbox purchase).
     *
     * @return the sandboxType value.
     */
    public SandboxTypeEnum getSandboxType() {
        return this.sandboxType;
    }

    /**
     * Set the sandboxType property: Possible Values are None, Csp (Csp sandbox purchase).
     *
     * @param sandboxType the sandboxType value to set.
     * @return the Subscription object itself.
     */
    public Subscription setSandboxType(SandboxTypeEnum sandboxType) {
        this.sandboxType = sandboxType;
        return this;
    }
}
