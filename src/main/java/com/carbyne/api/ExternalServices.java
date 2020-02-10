package com.carbyne.api;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ExternalServices extends RecordsService {
    protected String externalService = recordsEndpoint + "ExternalServices/";

    public Response getHealthCheck(){
      return given().get(externalService+"HealthCheck").thenReturn();
    }

}
