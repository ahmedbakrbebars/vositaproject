package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import junit.framework.Assert;

import java.util.HashMap;
import  static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class registration {
    HashMap<String,Object>body = new HashMap<>();
    private Response response ;
    private int status ;
    @Given("User has valid register data")
    public void registerData (){
        body.put("id" , 0);
        body.put("username","bebars");
        body.put("firstName","Ahmed");
        body.put("lastName","Bebars");
        body.put("email","bebars@test.com");
        body.put("password","12345678");
        body.put("phone","01032341293");
        body.put("userStatus",0);
    }
    @When("User sends his register data")
    public void sendRegisterData(){
        response = given().baseUri("https://petstore.swagger.io/v2")
                .contentType(ContentType.JSON)
                .body(body)
                .when()
                .post("user")
                .then().extract().response();
    }
    @Then("user register successfully")
    public void userRegistersSuccessfully(){
        status = response.getStatusCode();
        System.out.println(status);
        Assert.assertEquals(200 , status);
    }
}
