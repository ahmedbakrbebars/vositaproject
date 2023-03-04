package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import junit.framework.Assert;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class login {
    HashMap<String,Object> body = new HashMap<>();
    private Response response ;
    private int status;
    @Given("User has valid login data")
    public void registerData (){
        body.put("username","bebars");
        body.put("password","12345678");
    }
    @When("User sends his login data")
    public void sendRegisterData(){
        response = given().baseUri("https://petstore.swagger.io/v2")
                .contentType(ContentType.JSON)
                .queryParams(body)
                .when()
                .get("user/login")
                .then().extract().response();
    }
    @Then("login successfully")
    public void userRegistersSuccessfully(){
        status = response.getStatusCode();
        System.out.println(status);
        Assert.assertEquals(200 , status);
    }

}
