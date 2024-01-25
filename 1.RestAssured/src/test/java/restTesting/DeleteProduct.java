package restTesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeleteProduct {
	
	@Test
	public void deleteProduct()
	{
		
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/delete-shoe")
		.queryParam("id", "1020")
		.when().delete()
		.then().log().all();
		
	}
}