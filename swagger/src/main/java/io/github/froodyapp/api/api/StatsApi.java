/*
 * Froody API
 * API for Froody application
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.github.froodyapp.api.api;

import io.github.froodyapp.api.invoker.ApiCallback;
import io.github.froodyapp.api.invoker.ApiClient;
import io.github.froodyapp.api.invoker.ApiException;
import io.github.froodyapp.api.invoker.ApiResponse;
import io.github.froodyapp.api.invoker.Configuration;
import io.github.froodyapp.api.invoker.Pair;
import io.github.froodyapp.api.invoker.ProgressRequestBody;
import io.github.froodyapp.api.invoker.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.github.froodyapp.api.model_.ResponseOk;
import io.github.froodyapp.api.model_.ServerOverallStats;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StatsApi {
    private ApiClient apiClient;

    public StatsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public StatsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for statsOverallGet
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call statsOverallGetCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/stats/overall";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call statsOverallGetValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = statsOverallGetCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Overall statistics
     * @return ServerOverallStats
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ServerOverallStats statsOverallGet() throws ApiException {
        ApiResponse<ServerOverallStats> resp = statsOverallGetWithHttpInfo();
        return resp.getData();
    }

    /**
     * 
     * Overall statistics
     * @return ApiResponse&lt;ServerOverallStats&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ServerOverallStats> statsOverallGetWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = statsOverallGetValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<ServerOverallStats>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Overall statistics
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call statsOverallGetAsync(final ApiCallback<ServerOverallStats> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = statsOverallGetValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ServerOverallStats>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
