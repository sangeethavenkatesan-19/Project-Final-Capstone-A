package restTesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class AddProduct {
	@Test
	public void add_new_product()
	{
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/add-shoe")
		.queryParam("id","1020")
		.queryParam("image", "www.imge.com")
		.queryParam("name","Nike")
		.queryParam("category", "Running")
		.queryParam("sizes","5,6,7")
		.queryParam("price", "2000")
		.when()
		.post()
		.then()
		.log().all();
		
	}	
}