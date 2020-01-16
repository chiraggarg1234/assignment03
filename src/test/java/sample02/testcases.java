package sample02;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class testcases 
{
  void getreq(traveler t)
  {
	 // System.out.println(t.code);
	  RestAssured.baseURI=t.base;
	  RequestSpecification httprequest=RestAssured.given();
	  Response response=httprequest.request(Method.GET,t.ex);
	  
	  String responsebody=response.getBody().asString();
	  System.out.println(responsebody);
	  
	  int statuscode=response.getStatusCode();
	  System.out.println("#############");
	  System.out.println(statuscode);
	  System.out.println("##############");
//	  Assert.assertEquals(statuscode, 200);
  }
	
  void postreq(traveler t)
  {
	  RestAssured.baseURI=t.base;
	  RequestSpecification httprequest=RestAssured.given();
	  httprequest.body(t.body);
	  Response response=httprequest.request(Method.POST,t.ex);
	  
	  String responsebody=response.getBody().asString();
	  System.out.println(responsebody);
	  
	  int statuscode=response.getStatusCode();
	  System.out.println("#############");
	  System.out.println(statuscode);
	  System.out.println("##############");
	  
	  
  }
}
