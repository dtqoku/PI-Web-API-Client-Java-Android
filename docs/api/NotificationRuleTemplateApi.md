# NotificationRuleTemplateApi

Method | HTTP request | Description
------------ | ------------- | -------------
[**get**](NotificationRuleTemplateApi.md#get) | **GET** /notificationruletemplates/{webId} | Get the specified notification rule template.
[**getNotificationRuleTemplateSubscribers**](NotificationRuleTemplateApi.md#getnotificationruletemplatesubscribers) | **GET** /notificationruletemplates/{webId}/notificationrulesubscribers | Retrieve notification rule template subscribers.
[**getNotificationRuleTemplatesQuery**](NotificationRuleTemplateApi.md#getnotificationruletemplatesquery) | **GET** /notificationruletemplates/search | Retrieve Notification rule templates based on the specified conditions. Returns Notification rule templates using the specified search query string.


# **get**
> get(String webId, String selectedFields, String webIdType)

Get the specified notification rule template.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of the notification rule template.. | [required]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **webIdType** | **String**| Optional parameter. Used to specify the type of WebID. Useful for URL brevity and other special cases. Default is the value of the configuration item "WebIDType".. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **getNotificationRuleTemplateSubscribers**
> getNotificationRuleTemplateSubscribers(String webId, String selectedFields, String webIdType)

Retrieve notification rule template subscribers.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of the resource to use as the root of the search.. | [required]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **webIdType** | **String**| Optional parameter. Used to specify the type of WebID. Useful for URL brevity and other special cases. Default is the value of the configuration item "WebIDType".. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **getNotificationRuleTemplatesQuery**
> getNotificationRuleTemplatesQuery(String databaseWebId, Integer maxCount, String query, String selectedFields, Integer startIndex, String webIdType)

Retrieve Notification rule templates based on the specified conditions. Returns Notification rule templates using the specified search query string.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **databaseWebId** | **String**| The ID of the asset database to use as the root of the query.. | [optional]
 **maxCount** | **Integer**| The maximum number of objects to be returned per call (page size). The default is 1000.. | [optional]
 **query** | **String**| The query string is a list of filters used to perform an AFSearch for the Notification rule templates in the asset database. An example would be: "query=NotificationRuleTemplate:{ Name:='MyNotificationRuleTemplate' } Type:=Int32".. | [optional]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **startIndex** | **Integer**| The starting index (zero based) of the items to be returned. The default is 0.. | [optional]
 **webIdType** | **String**| Optional parameter. Used to specify the type of WebID. Useful for URL brevity and other special cases. Default is the value of the configuration item "WebIDType".. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)
