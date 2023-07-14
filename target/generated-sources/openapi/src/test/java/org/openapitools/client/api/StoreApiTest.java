/*
 * Swagger Petstore
 * This is a sample Petstore server.  You can find  out more about Swagger at  [http://swagger.io](http://swagger.io) or on  [irc.freenode.net, #swagger](http://swagger.io/irc/). 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.model.OrderPetStore;
import org.openapitools.client.ApiClient;
import org.openapitools.client.api.StoreApi;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.ErrorLoggingFilter;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static io.restassured.config.ObjectMapperConfig.objectMapperConfig;
import static io.restassured.config.RestAssuredConfig.config;
import static org.openapitools.client.GsonObjectMapper.gson;

/**
 * API tests for StoreApi
 */
@Ignore
public class StoreApiTest {

    private StoreApi api;

    @Before
    public void createApi() {
        api = ApiClient.api(ApiClient.Config.apiConfig().reqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setConfig(config().objectMapperConfig(objectMapperConfig().defaultObjectMapper(gson())))
                        .addFilter(new ErrorLoggingFilter())
                        .setBaseUri("https://virtserver.swaggerhub.com/poznanski.alex/SmartServerAPIOpenAPI2/1.0.0"))).store();
    }

    /**
     * Invalid ID supplied
     */
    @Test
    public void shouldSee400AfterDeleteOrder() {
        Long orderId = null;
        api.deleteOrder()
                .orderIdPath(orderId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Order not found
     */
    @Test
    public void shouldSee404AfterDeleteOrder() {
        Long orderId = null;
        api.deleteOrder()
                .orderIdPath(orderId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * successful operation
     */
    @Test
    public void shouldSee200AfterGetInventory() {
        api.getInventory().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * successful operation
     */
    @Test
    public void shouldSee200AfterGetOrderById() {
        Long orderId = null;
        api.getOrderById()
                .orderIdPath(orderId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Invalid ID supplied
     */
    @Test
    public void shouldSee400AfterGetOrderById() {
        Long orderId = null;
        api.getOrderById()
                .orderIdPath(orderId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Order not found
     */
    @Test
    public void shouldSee404AfterGetOrderById() {
        Long orderId = null;
        api.getOrderById()
                .orderIdPath(orderId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * successful operation
     */
    @Test
    public void shouldSee200AfterPlaceOrder() {
        OrderPetStore body = null;
        api.placeOrder()
                .body(body).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Invalid Order
     */
    @Test
    public void shouldSee400AfterPlaceOrder() {
        OrderPetStore body = null;
        api.placeOrder()
                .body(body).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

}