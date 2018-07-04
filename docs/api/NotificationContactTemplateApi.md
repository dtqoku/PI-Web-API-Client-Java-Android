# NotificationContactTemplateApi

Method | HTTP request | Description
------------ | ------------- | -------------
[**get**](NotificationContactTemplateApi.md#get) | **GET** /notificationcontacttemplates/{webId} | Retrieve a notification contact template.


# **get**
> get(String webId, String selectedFields, String webIdType)

Retrieve a notification contact template.

### Parameters

Name | Type | Description | Notes
------------- | ------------- | ------------- | -------------
 **webId** | **String**| The ID of the notification contact template.. | [required]
 **selectedFields** | **String**| List of fields to be returned in the response, separated by semicolons (;). If this parameter is not specified, all available fields will be returned.. | [optional]
 **webIdType** | **String**| Optional parameter. Used to specify the type of WebID. Useful for URL brevity and other special cases. Default is the value of the configuration item "WebIDType".. | [optional]


### Return type



[[Back to top]](#) [[Back to API list]](../../DOCUMENTATION.md#documentation-for-api-endpoints) [[Back to Model list]](../../DOCUMENTATION.md#documentation-for-models) [[Back to DOCUMENTATION]](../../DOCUMENTATION.md)
