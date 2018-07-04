# NotificationRuleApi

Method | HTTP request | Description
------------ | ------------- | -------------
[**getNotificationRules**](NotificationRuleApi.md#getnotificationrules) | **GET** /notificationrules/{webId} | Retrieve a notification rule.
[**getNotificationRuleSubscribers**](NotificationRuleApi.md#getnotificationrulesubscribers) | **GET** /notificationrules/{webId}/notificationrulesubscribers | Retrieve notification rule subscribers.
[**getNotificationRulesQuery**](NotificationRuleApi.md#getnotificationrulesquery) | **GET** /notificationrules/search | Retrieve notification rules based on the specified conditions. Returns notification rules using the specified search query string.


# **getNotificationRules**
> getNotificationRules(String webId, String selectedFields, String webIdType)

Retrieve a notification rule.

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

Retrieve notification rule subscribers.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of the resource to use as the root of the search.. | [required]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **webIdType** | **String**| Optional parameter. Used to specify the type of WebID. Useful for URL brevity and other special cases. Default is the value of the configuration item "WebIDType".. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)

# **getNotificationRulesQuery**
> getNotificationRulesQuery(String databaseWebId, Integer maxCount, String query, String selectedFields, Integer startIndex, String webIdType)

Retrieve notification rules based on the specified conditions. Returns notification rules using the specified search query string.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **databaseWebId** | **String**| The ID of the asset database to use as the root of the query.. | [optional]
 **maxCount** | **Integer**| The maximum number of objects to be returned per call (page size). The default is 1000.. | [optional]
 **query** | **String**| The query string is a list of filters used to perform an AFSearch for the Notification rules in the asset database. An example would be: "query=Name:=MyNotificationRule* Template:=NoteRuleTemplate*".. | [optional]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **startIndex** | **Integer**| The starting index (zero based) of the items to be returned. The default is 0.. | [optional]
 **webIdType** | **String**| Optional parameter. Used to specify the type of WebID. Useful for URL brevity and other special cases. Default is the value of the configuration item "WebIDType".. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)
