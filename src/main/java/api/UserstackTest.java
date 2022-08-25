package api;
import io.restassured.http.ContentType;
import org.junit.Test;
import static io.restassured.RestAssured.given;


public class UserstackTest {
    private final static String URL = "http://api.userstack.com/";
    private final static String ACCESS_KEY = "d46f1894aef77e376a2282a1cf990200";
    
    @Test
    public void test(){

                given()
                .when()
                .contentType(ContentType.JSON)
                .get(URL+"/detect?access_key=d46f1894aef77e376a2282a1cf990200&ua=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/104.0.0.0 Safari/537.36")
                .then().statusCode(200).log().all()
                .extract().body().jsonPath().getList("browser", Browser.class) ;

    }
}
