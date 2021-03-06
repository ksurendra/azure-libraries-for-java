/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.search.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.search.AdminKeyKind;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.UUID;
import okhttp3.ResponseBody;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in AdminKeys.
 */
public class AdminKeysInner {
    /** The Retrofit service to perform REST calls. */
    private AdminKeysService service;
    /** The service client containing this operation class. */
    private SearchManagementClientImpl client;

    /**
     * Initializes an instance of AdminKeysInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public AdminKeysInner(Retrofit retrofit, SearchManagementClientImpl client) {
        this.service = retrofit.create(AdminKeysService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for AdminKeys to be
     * used by Retrofit to perform actually REST calls.
     */
    interface AdminKeysService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.search.AdminKeys get" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Search/searchServices/{searchServiceName}/listAdminKeys")
        Observable<Response<ResponseBody>> get(@Path("resourceGroupName") String resourceGroupName, @Path("searchServiceName") String searchServiceName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("x-ms-client-request-id") UUID clientRequestId, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.search.AdminKeys regenerate" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Search/searchServices/{searchServiceName}/regenerateAdminKey/{keyKind}")
        Observable<Response<ResponseBody>> regenerate(@Path("resourceGroupName") String resourceGroupName, @Path("searchServiceName") String searchServiceName, @Path("keyKind") AdminKeyKind keyKind, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("x-ms-client-request-id") UUID clientRequestId, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets the primary and secondary admin API keys for the specified Azure Search service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Search service associated with the specified resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AdminKeyResultInner object if successful.
     */
    public AdminKeyResultInner get(String resourceGroupName, String searchServiceName) {
        return getWithServiceResponseAsync(resourceGroupName, searchServiceName).toBlocking().single().body();
    }

    /**
     * Gets the primary and secondary admin API keys for the specified Azure Search service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Search service associated with the specified resource group.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AdminKeyResultInner> getAsync(String resourceGroupName, String searchServiceName, final ServiceCallback<AdminKeyResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, searchServiceName), serviceCallback);
    }

    /**
     * Gets the primary and secondary admin API keys for the specified Azure Search service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Search service associated with the specified resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdminKeyResultInner object
     */
    public Observable<AdminKeyResultInner> getAsync(String resourceGroupName, String searchServiceName) {
        return getWithServiceResponseAsync(resourceGroupName, searchServiceName).map(new Func1<ServiceResponse<AdminKeyResultInner>, AdminKeyResultInner>() {
            @Override
            public AdminKeyResultInner call(ServiceResponse<AdminKeyResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the primary and secondary admin API keys for the specified Azure Search service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Search service associated with the specified resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdminKeyResultInner object
     */
    public Observable<ServiceResponse<AdminKeyResultInner>> getWithServiceResponseAsync(String resourceGroupName, String searchServiceName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (searchServiceName == null) {
            throw new IllegalArgumentException("Parameter searchServiceName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final SearchManagementRequestOptionsInner searchManagementRequestOptions = null;
        UUID clientRequestId = null;
        return service.get(resourceGroupName, searchServiceName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), clientRequestId, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AdminKeyResultInner>>>() {
                @Override
                public Observable<ServiceResponse<AdminKeyResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AdminKeyResultInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Gets the primary and secondary admin API keys for the specified Azure Search service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Search service associated with the specified resource group.
     * @param searchManagementRequestOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AdminKeyResultInner object if successful.
     */
    public AdminKeyResultInner get(String resourceGroupName, String searchServiceName, SearchManagementRequestOptionsInner searchManagementRequestOptions) {
        return getWithServiceResponseAsync(resourceGroupName, searchServiceName, searchManagementRequestOptions).toBlocking().single().body();
    }

    /**
     * Gets the primary and secondary admin API keys for the specified Azure Search service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Search service associated with the specified resource group.
     * @param searchManagementRequestOptions Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AdminKeyResultInner> getAsync(String resourceGroupName, String searchServiceName, SearchManagementRequestOptionsInner searchManagementRequestOptions, final ServiceCallback<AdminKeyResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, searchServiceName, searchManagementRequestOptions), serviceCallback);
    }

    /**
     * Gets the primary and secondary admin API keys for the specified Azure Search service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Search service associated with the specified resource group.
     * @param searchManagementRequestOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdminKeyResultInner object
     */
    public Observable<AdminKeyResultInner> getAsync(String resourceGroupName, String searchServiceName, SearchManagementRequestOptionsInner searchManagementRequestOptions) {
        return getWithServiceResponseAsync(resourceGroupName, searchServiceName, searchManagementRequestOptions).map(new Func1<ServiceResponse<AdminKeyResultInner>, AdminKeyResultInner>() {
            @Override
            public AdminKeyResultInner call(ServiceResponse<AdminKeyResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the primary and secondary admin API keys for the specified Azure Search service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Search service associated with the specified resource group.
     * @param searchManagementRequestOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdminKeyResultInner object
     */
    public Observable<ServiceResponse<AdminKeyResultInner>> getWithServiceResponseAsync(String resourceGroupName, String searchServiceName, SearchManagementRequestOptionsInner searchManagementRequestOptions) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (searchServiceName == null) {
            throw new IllegalArgumentException("Parameter searchServiceName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(searchManagementRequestOptions);
        UUID clientRequestId = null;
        if (searchManagementRequestOptions != null) {
            clientRequestId = searchManagementRequestOptions.clientRequestId();
        }
        return service.get(resourceGroupName, searchServiceName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), clientRequestId, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AdminKeyResultInner>>>() {
                @Override
                public Observable<ServiceResponse<AdminKeyResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AdminKeyResultInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AdminKeyResultInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<AdminKeyResultInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<AdminKeyResultInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Regenerates either the primary or secondary admin API key. You can only regenerate one key at a time.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Search service associated with the specified resource group.
     * @param keyKind Specifies which key to regenerate. Valid values include 'primary' and 'secondary'. Possible values include: 'primary', 'secondary'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AdminKeyResultInner object if successful.
     */
    public AdminKeyResultInner regenerate(String resourceGroupName, String searchServiceName, AdminKeyKind keyKind) {
        return regenerateWithServiceResponseAsync(resourceGroupName, searchServiceName, keyKind).toBlocking().single().body();
    }

    /**
     * Regenerates either the primary or secondary admin API key. You can only regenerate one key at a time.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Search service associated with the specified resource group.
     * @param keyKind Specifies which key to regenerate. Valid values include 'primary' and 'secondary'. Possible values include: 'primary', 'secondary'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AdminKeyResultInner> regenerateAsync(String resourceGroupName, String searchServiceName, AdminKeyKind keyKind, final ServiceCallback<AdminKeyResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(regenerateWithServiceResponseAsync(resourceGroupName, searchServiceName, keyKind), serviceCallback);
    }

    /**
     * Regenerates either the primary or secondary admin API key. You can only regenerate one key at a time.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Search service associated with the specified resource group.
     * @param keyKind Specifies which key to regenerate. Valid values include 'primary' and 'secondary'. Possible values include: 'primary', 'secondary'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdminKeyResultInner object
     */
    public Observable<AdminKeyResultInner> regenerateAsync(String resourceGroupName, String searchServiceName, AdminKeyKind keyKind) {
        return regenerateWithServiceResponseAsync(resourceGroupName, searchServiceName, keyKind).map(new Func1<ServiceResponse<AdminKeyResultInner>, AdminKeyResultInner>() {
            @Override
            public AdminKeyResultInner call(ServiceResponse<AdminKeyResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Regenerates either the primary or secondary admin API key. You can only regenerate one key at a time.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Search service associated with the specified resource group.
     * @param keyKind Specifies which key to regenerate. Valid values include 'primary' and 'secondary'. Possible values include: 'primary', 'secondary'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdminKeyResultInner object
     */
    public Observable<ServiceResponse<AdminKeyResultInner>> regenerateWithServiceResponseAsync(String resourceGroupName, String searchServiceName, AdminKeyKind keyKind) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (searchServiceName == null) {
            throw new IllegalArgumentException("Parameter searchServiceName is required and cannot be null.");
        }
        if (keyKind == null) {
            throw new IllegalArgumentException("Parameter keyKind is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final SearchManagementRequestOptionsInner searchManagementRequestOptions = null;
        UUID clientRequestId = null;
        return service.regenerate(resourceGroupName, searchServiceName, keyKind, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), clientRequestId, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AdminKeyResultInner>>>() {
                @Override
                public Observable<ServiceResponse<AdminKeyResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AdminKeyResultInner> clientResponse = regenerateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Regenerates either the primary or secondary admin API key. You can only regenerate one key at a time.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Search service associated with the specified resource group.
     * @param keyKind Specifies which key to regenerate. Valid values include 'primary' and 'secondary'. Possible values include: 'primary', 'secondary'
     * @param searchManagementRequestOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AdminKeyResultInner object if successful.
     */
    public AdminKeyResultInner regenerate(String resourceGroupName, String searchServiceName, AdminKeyKind keyKind, SearchManagementRequestOptionsInner searchManagementRequestOptions) {
        return regenerateWithServiceResponseAsync(resourceGroupName, searchServiceName, keyKind, searchManagementRequestOptions).toBlocking().single().body();
    }

    /**
     * Regenerates either the primary or secondary admin API key. You can only regenerate one key at a time.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Search service associated with the specified resource group.
     * @param keyKind Specifies which key to regenerate. Valid values include 'primary' and 'secondary'. Possible values include: 'primary', 'secondary'
     * @param searchManagementRequestOptions Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AdminKeyResultInner> regenerateAsync(String resourceGroupName, String searchServiceName, AdminKeyKind keyKind, SearchManagementRequestOptionsInner searchManagementRequestOptions, final ServiceCallback<AdminKeyResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(regenerateWithServiceResponseAsync(resourceGroupName, searchServiceName, keyKind, searchManagementRequestOptions), serviceCallback);
    }

    /**
     * Regenerates either the primary or secondary admin API key. You can only regenerate one key at a time.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Search service associated with the specified resource group.
     * @param keyKind Specifies which key to regenerate. Valid values include 'primary' and 'secondary'. Possible values include: 'primary', 'secondary'
     * @param searchManagementRequestOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdminKeyResultInner object
     */
    public Observable<AdminKeyResultInner> regenerateAsync(String resourceGroupName, String searchServiceName, AdminKeyKind keyKind, SearchManagementRequestOptionsInner searchManagementRequestOptions) {
        return regenerateWithServiceResponseAsync(resourceGroupName, searchServiceName, keyKind, searchManagementRequestOptions).map(new Func1<ServiceResponse<AdminKeyResultInner>, AdminKeyResultInner>() {
            @Override
            public AdminKeyResultInner call(ServiceResponse<AdminKeyResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Regenerates either the primary or secondary admin API key. You can only regenerate one key at a time.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Search service associated with the specified resource group.
     * @param keyKind Specifies which key to regenerate. Valid values include 'primary' and 'secondary'. Possible values include: 'primary', 'secondary'
     * @param searchManagementRequestOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AdminKeyResultInner object
     */
    public Observable<ServiceResponse<AdminKeyResultInner>> regenerateWithServiceResponseAsync(String resourceGroupName, String searchServiceName, AdminKeyKind keyKind, SearchManagementRequestOptionsInner searchManagementRequestOptions) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (searchServiceName == null) {
            throw new IllegalArgumentException("Parameter searchServiceName is required and cannot be null.");
        }
        if (keyKind == null) {
            throw new IllegalArgumentException("Parameter keyKind is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(searchManagementRequestOptions);
        UUID clientRequestId = null;
        if (searchManagementRequestOptions != null) {
            clientRequestId = searchManagementRequestOptions.clientRequestId();
        }
        return service.regenerate(resourceGroupName, searchServiceName, keyKind, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), clientRequestId, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AdminKeyResultInner>>>() {
                @Override
                public Observable<ServiceResponse<AdminKeyResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AdminKeyResultInner> clientResponse = regenerateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AdminKeyResultInner> regenerateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<AdminKeyResultInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<AdminKeyResultInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
