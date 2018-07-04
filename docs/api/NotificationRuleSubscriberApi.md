# NotificationRuleSubscriberApi

Method | HTTP request | Description
------------ | ------------- | -------------
[**getNotificationRuleSubscriberByPath**](NotificationRuleSubscriberApi.md#getnotificationrulesubscriberbypath) | **GET** /notificationrulesubscribers | Retrieve a notification rule subscriber by path.
[**getNotificationRuleSubscriber**](NotificationRuleSubscriberApi.md#getnotificationrulesubscriber) | **GET** /notificationrulesubscribers/{webId} | Retrieve a notification rule subscriber.
[**getNotificationRuleSubscribers**](NotificationRuleSubscriberApi.md#getnotificationrulesubscribers) | **GET** /notificationrulesubscribers/{webId}/notificationrulesubscribers | Retrieve notification rule subscriber subscribers.


# **getNotificationRuleSubscriberByPath**
> getNotificationRuleSubscriberByPath(String path, String selectedFields, String webIdType)

Retrieve a notification rule subscriber by path.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| The path to the notification rule subscriber.. | [required]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **webIdType** | **String**| Optional parameter. Used to specify the type of WebID. Useful for URL brevity and other special cases. Default is the value of the configuration item "WebIDType".. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **getNotificationRuleSubscriber**
> getNotificationRuleSubscriber(String webId, String selectedFields, String webIdType)

Retrieve a notification rule subscriber.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of the resource to use as the root of the search.. | [required]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **webIdType** | **String**| Optional parameter. Used to specify the type of WebID. Useful for URL brevity and other special cases. Default is the value of the configuration item "WebIDType".. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **getNotificationRuleSubscribers**
> getNotificationRuleSubscribers(String webId, String selectedFields, String webIdType)

Retrieve notification rule subscriber subscribers.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of the resource to use as the root of the search.. | [required]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **webIdType** | **String**| Optional parameter. Used to specify the type of WebID. Useful for URL brevity and other special cases. Default is the value of the configuration item "WebIDType".. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)
