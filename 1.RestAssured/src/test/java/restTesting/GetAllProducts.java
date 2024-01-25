package restTesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

	public class GetAllProducts {
		
		@Test(description = "Test for executing GET request using rest assured")
		public void getallshoes() {
			
			RestAssured.given()
			.baseUri("http://localhost:9010")
			.basePath("/get-shoes")
			.when()
			.get()
			.then()
			.statusCode(200)
			.log()
			.all();
			
	}
}