/*
 *
 * Copyright 2018 OSIsoft, LLC
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   <http://www.apache.org/licenses/LICENSE-2.0>
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.osisoft.pidevclub.piwebapi.api;
import com.osisoft.pidevclub.piwebapi.ApiCallback;
import com.osisoft.pidevclub.piwebapi.ApiClient;
import com.osisoft.pidevclub.piwebapi.ApiException;
import com.osisoft.pidevclub.piwebapi.ApiResponse;
import com.osisoft.pidevclub.piwebapi.Configuration;
import com.osisoft.pidevclub.piwebapi.Pair;
import com.osisoft.pidevclub.piwebapi.ProgressRequestBody;
import com.osisoft.pidevclub.piwebapi.ProgressResponseBody;
import com.osisoft.pidevclub.piwebapi.models.*;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificationRuleApi {
	private ApiClient apiClient;
	public NotificationRuleApi(ApiClient apiClient){
		this.apiClient = apiClient;
	}
	public ApiClient getApiClient() {
		return apiClient;
	}
	public void setApiClient(ApiClient apiClient) {
		this.apiClient = apiClient;
	}
	/**
	 * Retrieve a notification rule. 
	 *
	 */
	public PINotificationRule getNotificationRules(String webId, String selectedFields, String webIdType) throws ApiException {
		ApiResponse<PINotificationRule> resp = getNotificationRulesWithHttpInfo(webId, selectedFields, webIdType);
		return resp.getData();
	}

	/**
	 * Retrieve a notification rule. (with HTTP information)
	 *
	 */
	public ApiResponse<PINotificationRule> getNotificationRulesWithHttpInfo(String webId, String selectedFields, String webIdType) throws ApiException {
		okhttp3.Call call = getNotificationRulesCall(webId, selectedFields, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PINotificationRule>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Retrieve a notification rule. (asynchronously)
	 *
	 */
	public okhttp3.Call getNotificationRulesAsync(String webId, String selectedFields, String webIdType, final ApiCallback<PINotificationRule> callback) throws ApiException {
		ProgressResponseBody.ProgressListener progressListener = null;
		ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
		if (callback != null)
		{
			progressListener = new ProgressResponseBody.ProgressListener() {
				@Override
				public void update(long bytesRead, long contentLength, boolean done)
				{
					callback.onDownloadProgress(bytesRead, contentLength, done);
				}
			};
			progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
				@Override
				public void onRequestProgress(long bytesWritten, long contentLength, boolean done)
				{
					callback.onUploadProgress(bytesWritten, contentLength, done);
				}
			};
		}
		okhttp3.Call call = getNotificationRulesCall(webId, selectedFields, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getNotificationRulesCall(String webId, String selectedFields, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/notificationrules/{webId}";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		localVarPath = localVarPath.replaceAll("\\{webId\\}", apiClient.escapeString(webId.toString()));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (webIdType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webIdType", webIdType));
		if (progressListener != null)
		{
			apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
			@Override
			public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
				okhttp3.Response originalResponse = chain.proceed(chain.request());
				return originalResponse.newBuilder()
				.body(new ProgressResponseBody(originalResponse.body(), progressListener))
				.build();
				}
			});
		}
		String[] localVarAuthNames = new String[] {"Basic" };
		return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * Retrieve notification rule subscribers. 
	 *
	 */
	public PIItemsNotificationRuleSubscriber getNotificationRuleSubscribers(String webId, String selectedFields, String webIdType) throws ApiException {
		ApiResponse<PIItemsNotificationRuleSubscriber> resp = getNotificationRuleSubscribersWithHttpInfo(webId, selectedFields, webIdType);
		return resp.getData();
	}

	/**
	 * Retrieve notification rule subscribers. (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsNotificationRuleSubscriber> getNotificationRuleSubscribersWithHttpInfo(String webId, String selectedFields, String webIdType) throws ApiException {
		okhttp3.Call call = getNotificationRuleSubscribersCall(webId, selectedFields, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PIItemsNotificationRuleSubscriber>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Retrieve notification rule subscribers. (asynchronously)
	 *
	 */
	public okhttp3.Call getNotificationRuleSubscribersAsync(String webId, String selectedFields, String webIdType, final ApiCallback<PIItemsNotificationRuleSubscriber> callback) throws ApiException {
		ProgressResponseBody.ProgressListener progressListener = null;
		ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
		if (callback != null)
		{
			progressListener = new ProgressResponseBody.ProgressListener() {
				@Override
				public void update(long bytesRead, long contentLength, boolean done)
				{
					callback.onDownloadProgress(bytesRead, contentLength, done);
				}
			};
			progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
				@Override
				public void onRequestProgress(long bytesWritten, long contentLength, boolean done)
				{
					callback.onUploadProgress(bytesWritten, contentLength, done);
				}
			};
		}
		okhttp3.Call call = getNotificationRuleSubscribersCall(webId, selectedFields, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getNotificationRuleSubscribersCall(String webId, String selectedFields, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		// verify the required parameter 'webId' is set
		if (webId == null)
			throw new ApiException("Missing required parameter 'webId'");
		String localVarPath = "/notificationrules/{webId}/notificationrulesubscribers";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		localVarPath = localVarPath.replaceAll("\\{webId\\}", apiClient.escapeString(webId.toString()));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (webIdType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webIdType", webIdType));
		if (progressListener != null)
		{
			apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
			@Override
			public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
				okhttp3.Response originalResponse = chain.proceed(chain.request());
				return originalResponse.newBuilder()
				.body(new ProgressResponseBody(originalResponse.body(), progressListener))
				.build();
				}
			});
		}
		String[] localVarAuthNames = new String[] {"Basic" };
		return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

	/**
	 * Retrieve notification rules based on the specified conditions. Returns notification rules using the specified search query string. 
	 *
	 */
	public PIItemsNotificationRule getNotificationRulesQuery(String databaseWebId, Integer maxCount, String query, String selectedFields, Integer startIndex, String webIdType) throws ApiException {
		ApiResponse<PIItemsNotificationRule> resp = getNotificationRulesQueryWithHttpInfo(databaseWebId, maxCount, query, selectedFields, startIndex, webIdType);
		return resp.getData();
	}

	/**
	 * Retrieve notification rules based on the specified conditions. Returns notification rules using the specified search query string. (with HTTP information)
	 *
	 */
	public ApiResponse<PIItemsNotificationRule> getNotificationRulesQueryWithHttpInfo(String databaseWebId, Integer maxCount, String query, String selectedFields, Integer startIndex, String webIdType) throws ApiException {
		okhttp3.Call call = getNotificationRulesQueryCall(databaseWebId, maxCount, query, selectedFields, startIndex, webIdType,null,null);
		Type localVarReturnType = new TypeToken<PIItemsNotificationRule>(){}.getType();
		return apiClient.execute(call, localVarReturnType);
	}

	/**
	 * Retrieve notification rules based on the specified conditions. Returns notification rules using the specified search query string. (asynchronously)
	 *
	 */
	public okhttp3.Call getNotificationRulesQueryAsync(String databaseWebId, Integer maxCount, String query, String selectedFields, Integer startIndex, String webIdType, final ApiCallback<PIItemsNotificationRule> callback) throws ApiException {
		ProgressResponseBody.ProgressListener progressListener = null;
		ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
		if (callback != null)
		{
			progressListener = new ProgressResponseBody.ProgressListener() {
				@Override
				public void update(long bytesRead, long contentLength, boolean done)
				{
					callback.onDownloadProgress(bytesRead, contentLength, done);
				}
			};
			progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
				@Override
				public void onRequestProgress(long bytesWritten, long contentLength, boolean done)
				{
					callback.onUploadProgress(bytesWritten, contentLength, done);
				}
			};
		}
		okhttp3.Call call = getNotificationRulesQueryCall(databaseWebId, maxCount, query, selectedFields, startIndex, webIdType, progressListener, progressRequestListener);
		apiClient.executeAsync(call, callback);
		return call;
	}

	private okhttp3.Call getNotificationRulesQueryCall(String databaseWebId, Integer maxCount, String query, String selectedFields, Integer startIndex, String webIdType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
		Object localVarPostBody =  null;
		String localVarPath = "/notificationrules/search";
		Map<String, String> localVarHeaderParams = new HashMap<String, String>();
		Map<String, Object> localVarFormParams = new HashMap<String, Object>();
		List<Pair> localVarQueryParams = new ArrayList<Pair>();

		final String[] localVarAccepts = {"application/json", "text/json", "text/html", "application/x-ms-application"};

		final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

		if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

		final String[] localVarContentTypes = {"application/json", "text/json" };

		final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
		localVarHeaderParams.put("Content-Type", localVarContentType);

		if (databaseWebId != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "databaseWebId", databaseWebId));
		if (maxCount != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "maxCount", maxCount));
		if (query != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "query", query));
		if (selectedFields != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "selectedFields", selectedFields));
		if (startIndex != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "startIndex", startIndex));
		if (webIdType != null)
			localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "webIdType", webIdType));
		if (progressListener != null)
		{
			apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
			@Override
			public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
				okhttp3.Response originalResponse = chain.proceed(chain.request());
				return originalResponse.newBuilder()
				.body(new ProgressResponseBody(originalResponse.body(), progressListener))
				.build();
				}
			});
		}
		String[] localVarAuthNames = new String[] {"Basic" };
		return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
	}

}
