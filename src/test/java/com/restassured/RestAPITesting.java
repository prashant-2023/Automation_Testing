package com.restassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestAPITesting {
	@Test
	public void RestAPITestingDemo() {
		
		Response resp = RestAssured.get("https://reqres.in/api/users?page=2");
		
	//	System.out.println(resp.getBody());
		//System.out.println(resp.getHeaders());
		System.out.println(resp.getBody());
	//	System.out.println(resp.getStatusCode());
	}

}
