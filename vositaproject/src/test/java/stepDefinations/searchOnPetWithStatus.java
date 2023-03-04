package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.given;

public class searchOnPetWithStatus {
    private  String availablePet;
    private Response response ;
    private  String petType ;
     @Given("User search with available value")
     public void addSearchValueAvaliable(){
          availablePet = "available";
     }
     @When("User sends his seach on pet data")
     public void addSearchValue_avaliable(){
         response= given().baseUri("https://petstore.swagger.io/v2")
                  .queryParam("status" , availablePet)
                  .when()
                  .get("pet/findByStatus")
                  .then().extract().response();
     }
     @Then("display avaliable pets")
     public void displayAvailablePets(){
        petType = response.path("[0].status");
         Assert.assertEquals("available",petType);
         System.out.println(petType);
     }

    @Given("User search with pending value")
    public void addSearchValuePending(){
        availablePet = "pending";
    }
    @When("User sends his seach on pending pet data")
    public void addSearchValue_pending(){
        response= given().baseUri("https://petstore.swagger.io/v2")
                .queryParam("status" , availablePet)
                .when()
                .get("pet/findByStatus")
                .then().extract().response();
    }
    @Then("display pending pets")
    public void displayPendingPets(){
        petType = response.path("[0].status");
        Assert.assertEquals("pending",petType);
        System.out.println(petType);
    }

    @Given("User search with sold value")
    public void addSearchValueSold(){
        availablePet = "sold";
    }
    @When("User sends his seach on sold pet data")
    public void addSearchValue_sold(){
        response= given().baseUri("https://petstore.swagger.io/v2")
                .queryParam("status" , availablePet)
                .when()
                .get("pet/findByStatus")
                .then().extract().response();
    }
    @Then("display sold pet")
    public void displaySoldPets(){
        petType = response.path("[0].status");
        Assert.assertEquals("sold",petType);
        System.out.println(petType);
    }


}
