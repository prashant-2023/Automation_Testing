package com.restassured;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
//import static io.restassured.matcher.RestAssuredMatchers.*;
//import static org.hamcrest.Matchers.*;
import io.restassured.response.Response;

public class RestAPITesting {
	@Test
	public void RestAPITestingDemo() {
		
		//Response resp = RestAssured.get("https://reqres.in/api/users");
		Response resp = given()
			.header("x-api-key","free_user_3Hqmfplg9arMKfDMfuOccDaXqgD")
			.when()
			.get("https://reqres.in/api/users");
			

	
		resp.prettyPrint();

		
		// System.out.println(resp.getBody().asString());

		// Print status code and headers for debugging
		System.out.println("Status code: " + resp.getStatusCode());
		System.out.println("Headers: " + resp.getHeaders());
		Assert.assertEquals(resp.getStatusCode(), 200);
	}

	
}
