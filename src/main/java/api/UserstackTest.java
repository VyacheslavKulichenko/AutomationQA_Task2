package api;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;


import static io.restassured.RestAssured.given;


public class UserstackTest {

    private final static String URL = "http://api.userstack.com/";
    private final static String PATH = "/detect?access_key=d46f1894aef77e376a2282a1cf990200&ua=Mozilla/5.0" +
            " (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/104.0.0.0 Safari/537.36";
   // ACCESS_KEY = "d46f1894aef77e376a2282a1cf990200";


        @Test
        public void test() {
//parsing the server response by pojo class
         UserstackRootPojo userstackRoot = given()
                    .when()
                    .contentType(ContentType.JSON)
                    .get(URL + PATH )
                    .then().statusCode(200).log().all()
                    .extract().as(UserstackRootPojo.class);

//checking for tatusCode
            // Specify the base URL to the RESTful web service
            RestAssured.baseURI = "http://api.userstack.com/";
            // Get the RequestSpecification of the request to be sent to the server
            RequestSpecification httpRequest = RestAssured.given();

            Response response = httpRequest.get("/detect?access_key=d46f1894aef77e376a2282a1cf990200&ua=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/104.0.0.0 Safari/537.36");

            // Get the status code of the request.
            //If request is successful, status code will be 200
            int statusCode = response.getStatusCode();

            // Assert that correct status code is returned.
            Assert.assertEquals(statusCode /*actual value*/, 200 /*expected value*/);
            System.out.println("code status check passed, response code:" + statusCode);

        }

}
