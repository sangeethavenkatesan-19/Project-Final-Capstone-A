package restTesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetAllRegisteredUsers {

	@Test
	public void getAllUsers()
	{
		
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/get-users")
		.when()
		.get()
		.then()
		.statusCode(200)
		.log()
		.all();
		
	}

}