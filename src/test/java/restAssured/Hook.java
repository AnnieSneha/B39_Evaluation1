package restAssured;

import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.RestAssured;


public class Hook {
	
	@Test(priority = 0)
	
	public void scheduleHook() {  //Schedules a Hook using POST method
		
		RestAssured.baseURI="https://posthook-api.mock.beeceptor.com";
		
		JSONObject js=new JSONObject();
		
		given().contentType("application/json").body(js.toJSONString()).when().post("/v1/hooks").then().statusCode(200).log().all();
	}
	
	@Test(priority = 1)
	
	public void getHook() {  //Retrieve the list of hooks using GET method
		
		RestAssured.baseURI="https://posthook-api.mock.beeceptor.com";
		
		given().get("/v1/hooks").then().statusCode(200).log().all();
		
	}
	
	@Test(priority = 2)
	
	public void getID() {  //Retrieves the Hook by id using GET method
		
		RestAssured.baseURI="https://posthook-api.mock.beeceptor.com";
		
		given().get("/v1/hooks/6ab4d4d5-4767-452d-b72f-6ec40562b27e").then().statusCode(200).log().all();
		
	}
	
	@Test(priority = 3)
	
	public void updateHook() {  //Updating a hooks using PUT method
		
		RestAssured.baseURI="https://posthook-api.mock.beeceptor.com";
		
		JSONObject jsonObject=new JSONObject();
		
		jsonObject.put("name","updated-project");
		
		jsonObject.put("domain", "api.example.com");
		
		jsonObject.put("headerAuthorization", "");
		
		jsonObject.put("minRetries", "1");
		
		jsonObject.put("retryDelaySecs", "5");
		
		given().contentType("application/json").body(jsonObject.toJSONString()).when().put("/v1/projects/").then().statusCode(200).log().all();
		
	}
	
	
	@Test(priority = 4)
	
	public void deleteID() {  //Deleting a Hook by ID using DELETE  method
		
		RestAssured.baseURI="https://app.beeceptor.com/mock-server/posthook-api";
		
		RestAssured.baseURI="https://posthook-api.mock.beeceptor.com";
		
		given().delete("/v1/hooks/6ab4d4d5-4767-452d-b72f-6ec40562b27e").then().statusCode(200).log().all();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}










