# DefaultApi

All URIs are relative to *http://sales-data-service:8000/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createClient**](DefaultApi.md#createClient) | **POST** /clients/create | Store the new client.
[**createProduct**](DefaultApi.md#createProduct) | **POST** /products/create | Store the new product.
[**createSaleOperation**](DefaultApi.md#createSaleOperation) | **POST** /sales/create | Store the new sale operation.
[**getClients**](DefaultApi.md#getClients) | **GET** /clients | Get the available clients.
[**getProducts**](DefaultApi.md#getProducts) | **GET** /products | Get the available products in the store.
[**getSalesOperations**](DefaultApi.md#getSalesOperations) | **GET** /sales | Get the available sales operations.
[**updateClient**](DefaultApi.md#updateClient) | **PUT** /clients/{clientId}/update | Update an exsiting client metadata.
[**updateProduct**](DefaultApi.md#updateProduct) | **PUT** /products/{productId}/update | Update an exsiting product metadata.
[**updateSaleOperation**](DefaultApi.md#updateSaleOperation) | **PUT** /sales/{saleId}/update | Update an exsiting sale operation metadata.


<a name="createClient"></a>
# **createClient**
> createClient(clientDAO)

Store the new client.

### Example
```java
// Import classes:
import colourmyplate.data.rest.client.v1.invoker.ApiClient;
import colourmyplate.data.rest.client.v1.invoker.ApiException;
import colourmyplate.data.rest.client.v1.invoker.Configuration;
import colourmyplate.data.rest.client.v1.invoker.models.*;
import colourmyplate.data.rest.client.v1.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://sales-data-service:8000/v1");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    ClientDAO clientDAO = new ClientDAO(); // ClientDAO | The new client metadata.
    try {
      apiInstance.createClient(clientDAO);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createClient");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientDAO** | [**ClientDAO**](ClientDAO.md)| The new client metadata. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The new client successfully stored. |  -  |
**500** | Internal server error. |  -  |

<a name="createProduct"></a>
# **createProduct**
> createProduct(productDAO)

Store the new product.

### Example
```java
// Import classes:
import colourmyplate.data.rest.client.v1.invoker.ApiClient;
import colourmyplate.data.rest.client.v1.invoker.ApiException;
import colourmyplate.data.rest.client.v1.invoker.Configuration;
import colourmyplate.data.rest.client.v1.invoker.models.*;
import colourmyplate.data.rest.client.v1.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://sales-data-service:8000/v1");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    ProductDAO productDAO = new ProductDAO(); // ProductDAO | The new product metadata.
    try {
      apiInstance.createProduct(productDAO);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createProduct");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productDAO** | [**ProductDAO**](ProductDAO.md)| The new product metadata. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The new product successfully stored. |  -  |
**500** | Internal server error. |  -  |

<a name="createSaleOperation"></a>
# **createSaleOperation**
> createSaleOperation(saleDAO)

Store the new sale operation.

### Example
```java
// Import classes:
import colourmyplate.data.rest.client.v1.invoker.ApiClient;
import colourmyplate.data.rest.client.v1.invoker.ApiException;
import colourmyplate.data.rest.client.v1.invoker.Configuration;
import colourmyplate.data.rest.client.v1.invoker.models.*;
import colourmyplate.data.rest.client.v1.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://sales-data-service:8000/v1");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    SaleDAO saleDAO = new SaleDAO(); // SaleDAO | The new sale operation metadata.
    try {
      apiInstance.createSaleOperation(saleDAO);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createSaleOperation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **saleDAO** | [**SaleDAO**](SaleDAO.md)| The new sale operation metadata. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The new sale operation successfully stored. |  -  |
**403** | Storing the new sale operation could not be completed. |  -  |
**404** | Storing the new sale operation could not be completed because some meta data (product or seller or client) could not be found. |  -  |
**500** | Internal server error. |  -  |

<a name="getClients"></a>
# **getClients**
> List&lt;ClientDAO&gt; getClients()

Get the available clients.

### Example
```java
// Import classes:
import colourmyplate.data.rest.client.v1.invoker.ApiClient;
import colourmyplate.data.rest.client.v1.invoker.ApiException;
import colourmyplate.data.rest.client.v1.invoker.Configuration;
import colourmyplate.data.rest.client.v1.invoker.models.*;
import colourmyplate.data.rest.client.v1.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://sales-data-service:8000/v1");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      List<ClientDAO> result = apiInstance.getClients();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getClients");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ClientDAO&gt;**](ClientDAO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Clients successfully fetched. |  -  |
**404** | No clients available. |  -  |
**500** | Internal server error. |  -  |

<a name="getProducts"></a>
# **getProducts**
> List&lt;ProductDAO&gt; getProducts()

Get the available products in the store.

### Example
```java
// Import classes:
import colourmyplate.data.rest.client.v1.invoker.ApiClient;
import colourmyplate.data.rest.client.v1.invoker.ApiException;
import colourmyplate.data.rest.client.v1.invoker.Configuration;
import colourmyplate.data.rest.client.v1.invoker.models.*;
import colourmyplate.data.rest.client.v1.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://sales-data-service:8000/v1");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      List<ProductDAO> result = apiInstance.getProducts();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getProducts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ProductDAO&gt;**](ProductDAO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Products successfully fetched. |  -  |
**404** | No products available in the store. |  -  |
**500** | Internal server error. |  -  |

<a name="getSalesOperations"></a>
# **getSalesOperations**
> List&lt;SaleDAO&gt; getSalesOperations()

Get the available sales operations.

### Example
```java
// Import classes:
import colourmyplate.data.rest.client.v1.invoker.ApiClient;
import colourmyplate.data.rest.client.v1.invoker.ApiException;
import colourmyplate.data.rest.client.v1.invoker.Configuration;
import colourmyplate.data.rest.client.v1.invoker.models.*;
import colourmyplate.data.rest.client.v1.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://sales-data-service:8000/v1");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      List<SaleDAO> result = apiInstance.getSalesOperations();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getSalesOperations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;SaleDAO&gt;**](SaleDAO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Sales operations successfully fetched. |  -  |
**404** | No sales operations available. |  -  |
**500** | Internal server error. |  -  |

<a name="updateClient"></a>
# **updateClient**
> updateClient(clientId, clientDAO)

Update an exsiting client metadata.

### Example
```java
// Import classes:
import colourmyplate.data.rest.client.v1.invoker.ApiClient;
import colourmyplate.data.rest.client.v1.invoker.ApiException;
import colourmyplate.data.rest.client.v1.invoker.Configuration;
import colourmyplate.data.rest.client.v1.invoker.models.*;
import colourmyplate.data.rest.client.v1.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://sales-data-service:8000/v1");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Integer clientId = 56; // Integer | Numeric ID of the client to get
    ClientDAO clientDAO = new ClientDAO(); // ClientDAO | The updated client metadata.
    try {
      apiInstance.updateClient(clientId, clientDAO);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateClient");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Integer**| Numeric ID of the client to get |
 **clientDAO** | [**ClientDAO**](ClientDAO.md)| The updated client metadata. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The client metadata successfully updated. |  -  |
**404** | Updating the client could not be completed because it could not be found. |  -  |
**500** | Internal server error. |  -  |

<a name="updateProduct"></a>
# **updateProduct**
> updateProduct(productId, productDAO)

Update an exsiting product metadata.

### Example
```java
// Import classes:
import colourmyplate.data.rest.client.v1.invoker.ApiClient;
import colourmyplate.data.rest.client.v1.invoker.ApiException;
import colourmyplate.data.rest.client.v1.invoker.Configuration;
import colourmyplate.data.rest.client.v1.invoker.models.*;
import colourmyplate.data.rest.client.v1.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://sales-data-service:8000/v1");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Integer productId = 56; // Integer | Numeric ID of the product to get
    ProductDAO productDAO = new ProductDAO(); // ProductDAO | The updated product metadata.
    try {
      apiInstance.updateProduct(productId, productDAO);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateProduct");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **Integer**| Numeric ID of the product to get |
 **productDAO** | [**ProductDAO**](ProductDAO.md)| The updated product metadata. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The product metadata successfully updated. |  -  |
**404** | Updating the product could not be completed because it could not be found. |  -  |
**500** | Internal server error. |  -  |

<a name="updateSaleOperation"></a>
# **updateSaleOperation**
> updateSaleOperation(saleId, saleDAO)

Update an exsiting sale operation metadata.

### Example
```java
// Import classes:
import colourmyplate.data.rest.client.v1.invoker.ApiClient;
import colourmyplate.data.rest.client.v1.invoker.ApiException;
import colourmyplate.data.rest.client.v1.invoker.Configuration;
import colourmyplate.data.rest.client.v1.invoker.models.*;
import colourmyplate.data.rest.client.v1.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://sales-data-service:8000/v1");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Integer saleId = 56; // Integer | Numeric ID of the client to get
    SaleDAO saleDAO = new SaleDAO(); // SaleDAO | The updated sale operation metadata.
    try {
      apiInstance.updateSaleOperation(saleId, saleDAO);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateSaleOperation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **saleId** | **Integer**| Numeric ID of the client to get |
 **saleDAO** | [**SaleDAO**](SaleDAO.md)| The updated sale operation metadata. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The sale operation metadata successfully updated. |  -  |
**403** | Updating the sale operation metadata could not be completed. |  -  |
**404** | Updating the sale operation could not be completed because some meta data could not be found. |  -  |
**500** | Internal server error. |  -  |

