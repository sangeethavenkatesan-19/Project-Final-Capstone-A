package restTesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class UpdateProduct {	
	@Test
	public void updateProduct()
	{
		
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/update-shoe")
		.queryParam("id","1020")
		.queryParam("image", "www.imge123.com")
		.queryParam("name","Reebok")
		.queryParam("category", "Running")
		.queryParam("sizes","5,6,7")
		.queryParam("price", "2500")
		.when()
		.put()
		.then()
		.log().all();
			
	}
}