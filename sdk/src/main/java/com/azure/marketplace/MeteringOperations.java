/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.azure.marketplace;

import com.azure.marketplace.models.UsageEvent;
import com.azure.marketplace.models.UsageEventOkResponse;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in MeteringOperations.
 */
public interface MeteringOperations {
    /**
     * Posts a single usage event to the marketplace metering service API.
     * Posts a single usage event to the marketplace metering service API.
     *
     * @param body the UsageEvent value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UsageEventOkResponse object if successful.
     */
    UsageEventOkResponse postUsageEvent(UsageEvent body);

    /**
     * Posts a single usage event to the marketplace metering service API.
     * Posts a single usage event to the marketplace metering service API.
     *
     * @param body the UsageEvent value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<UsageEventOkResponse> postUsageEventAsync(UsageEvent body, final ServiceCallback<UsageEventOkResponse> serviceCallback);

    /**
     * Posts a single usage event to the marketplace metering service API.
     * Posts a single usage event to the marketplace metering service API.
     *
     * @param body the UsageEvent value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UsageEventOkResponse object
     */
    Observable<UsageEventOkResponse> postUsageEventAsync(UsageEvent body);

    /**
     * Posts a single usage event to the marketplace metering service API.
     * Posts a single usage event to the marketplace metering service API.
     *
     * @param body the UsageEvent value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UsageEventOkResponse object
     */
    Observable<ServiceResponse<UsageEventOkResponse>> postUsageEventWithServiceResponseAsync(UsageEvent body);
    /**
     * Posts a single usage event to the marketplace metering service API.
     * Posts a single usage event to the marketplace metering service API.
     *
     * @param body the UsageEvent value
     * @param requestId A unique string value for tracking the request from the client, preferably a GUID. If this value isn't provided, one will be generated and provided in the response headers.
     * @param correlationId A unique string value for operation on the client. This parameter correlates all events from client operation with events on the server side. If this value isn't provided, one will be generated and provided in the response headers.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UsageEventOkResponse object if successful.
     */
    UsageEventOkResponse postUsageEvent(UsageEvent body, UUID requestId, UUID correlationId);

    /**
     * Posts a single usage event to the marketplace metering service API.
     * Posts a single usage event to the marketplace metering service API.
     *
     * @param body the UsageEvent value
     * @param requestId A unique string value for tracking the request from the client, preferably a GUID. If this value isn't provided, one will be generated and provided in the response headers.
     * @param correlationId A unique string value for operation on the client. This parameter correlates all events from client operation with events on the server side. If this value isn't provided, one will be generated and provided in the response headers.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<UsageEventOkResponse> postUsageEventAsync(UsageEvent body, UUID requestId, UUID correlationId, final ServiceCallback<UsageEventOkResponse> serviceCallback);

    /**
     * Posts a single usage event to the marketplace metering service API.
     * Posts a single usage event to the marketplace metering service API.
     *
     * @param body the UsageEvent value
     * @param requestId A unique string value for tracking the request from the client, preferably a GUID. If this value isn't provided, one will be generated and provided in the response headers.
     * @param correlationId A unique string value for operation on the client. This parameter correlates all events from client operation with events on the server side. If this value isn't provided, one will be generated and provided in the response headers.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UsageEventOkResponse object
     */
    Observable<UsageEventOkResponse> postUsageEventAsync(UsageEvent body, UUID requestId, UUID correlationId);

    /**
     * Posts a single usage event to the marketplace metering service API.
     * Posts a single usage event to the marketplace metering service API.
     *
     * @param body the UsageEvent value
     * @param requestId A unique string value for tracking the request from the client, preferably a GUID. If this value isn't provided, one will be generated and provided in the response headers.
     * @param correlationId A unique string value for operation on the client. This parameter correlates all events from client operation with events on the server side. If this value isn't provided, one will be generated and provided in the response headers.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UsageEventOkResponse object
     */
    Observable<ServiceResponse<UsageEventOkResponse>> postUsageEventWithServiceResponseAsync(UsageEvent body, UUID requestId, UUID correlationId);

    /**
     * Posts a set of usage events to the marketplace metering service API.
     * The batch usage event API allows you to emit usage events for more than one purchased entity at once. The batch usage event request references the metering services dimension defined by the publisher when publishing the offer.
     *
     * @param body the List&lt;UsageEvent&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;UsageEventOkResponse&gt; object if successful.
     */
    List<UsageEventOkResponse> postBatchUsageEvent(List<UsageEvent> body);

    /**
     * Posts a set of usage events to the marketplace metering service API.
     * The batch usage event API allows you to emit usage events for more than one purchased entity at once. The batch usage event request references the metering services dimension defined by the publisher when publishing the offer.
     *
     * @param body the List&lt;UsageEvent&gt; value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<UsageEventOkResponse>> postBatchUsageEventAsync(List<UsageEvent> body, final ServiceCallback<List<UsageEventOkResponse>> serviceCallback);

    /**
     * Posts a set of usage events to the marketplace metering service API.
     * The batch usage event API allows you to emit usage events for more than one purchased entity at once. The batch usage event request references the metering services dimension defined by the publisher when publishing the offer.
     *
     * @param body the List&lt;UsageEvent&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;UsageEventOkResponse&gt; object
     */
    Observable<List<UsageEventOkResponse>> postBatchUsageEventAsync(List<UsageEvent> body);

    /**
     * Posts a set of usage events to the marketplace metering service API.
     * The batch usage event API allows you to emit usage events for more than one purchased entity at once. The batch usage event request references the metering services dimension defined by the publisher when publishing the offer.
     *
     * @param body the List&lt;UsageEvent&gt; value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;UsageEventOkResponse&gt; object
     */
    Observable<ServiceResponse<List<UsageEventOkResponse>>> postBatchUsageEventWithServiceResponseAsync(List<UsageEvent> body);
    /**
     * Posts a set of usage events to the marketplace metering service API.
     * The batch usage event API allows you to emit usage events for more than one purchased entity at once. The batch usage event request references the metering services dimension defined by the publisher when publishing the offer.
     *
     * @param body the List&lt;UsageEvent&gt; value
     * @param requestId A unique string value for tracking the request from the client, preferably a GUID. If this value isn't provided, one will be generated and provided in the response headers.
     * @param correlationId A unique string value for operation on the client. This parameter correlates all events from client operation with events on the server side. If this value isn't provided, one will be generated and provided in the response headers.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;UsageEventOkResponse&gt; object if successful.
     */
    List<UsageEventOkResponse> postBatchUsageEvent(List<UsageEvent> body, UUID requestId, UUID correlationId);

    /**
     * Posts a set of usage events to the marketplace metering service API.
     * The batch usage event API allows you to emit usage events for more than one purchased entity at once. The batch usage event request references the metering services dimension defined by the publisher when publishing the offer.
     *
     * @param body the List&lt;UsageEvent&gt; value
     * @param requestId A unique string value for tracking the request from the client, preferably a GUID. If this value isn't provided, one will be generated and provided in the response headers.
     * @param correlationId A unique string value for operation on the client. This parameter correlates all events from client operation with events on the server side. If this value isn't provided, one will be generated and provided in the response headers.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<UsageEventOkResponse>> postBatchUsageEventAsync(List<UsageEvent> body, UUID requestId, UUID correlationId, final ServiceCallback<List<UsageEventOkResponse>> serviceCallback);

    /**
     * Posts a set of usage events to the marketplace metering service API.
     * The batch usage event API allows you to emit usage events for more than one purchased entity at once. The batch usage event request references the metering services dimension defined by the publisher when publishing the offer.
     *
     * @param body the List&lt;UsageEvent&gt; value
     * @param requestId A unique string value for tracking the request from the client, preferably a GUID. If this value isn't provided, one will be generated and provided in the response headers.
     * @param correlationId A unique string value for operation on the client. This parameter correlates all events from client operation with events on the server side. If this value isn't provided, one will be generated and provided in the response headers.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;UsageEventOkResponse&gt; object
     */
    Observable<List<UsageEventOkResponse>> postBatchUsageEventAsync(List<UsageEvent> body, UUID requestId, UUID correlationId);

    /**
     * Posts a set of usage events to the marketplace metering service API.
     * The batch usage event API allows you to emit usage events for more than one purchased entity at once. The batch usage event request references the metering services dimension defined by the publisher when publishing the offer.
     *
     * @param body the List&lt;UsageEvent&gt; value
     * @param requestId A unique string value for tracking the request from the client, preferably a GUID. If this value isn't provided, one will be generated and provided in the response headers.
     * @param correlationId A unique string value for operation on the client. This parameter correlates all events from client operation with events on the server side. If this value isn't provided, one will be generated and provided in the response headers.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;UsageEventOkResponse&gt; object
     */
    Observable<ServiceResponse<List<UsageEventOkResponse>>> postBatchUsageEventWithServiceResponseAsync(List<UsageEvent> body, UUID requestId, UUID correlationId);

}