import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class login {
    @BeforeTest
    public void uri(){
        baseURI = "https://fakestoreapi.com";
    }
    @Test
    void LoginPositive(){
        JSONObject request = new JSONObject();
        request.put("username", "mor_2314");
        request.put("password", "83r5^_");

        String isiJson = request.toJSONString();
        //based on the website here would be eyJhbGciOiJIUzI1NiIsInR in the token
        given().header("content-type", "application/json").contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(isiJson)
                .when()
                .post("/auth/login")
                .then()
                .assertThat().body("token", containsString("eyJhbGciOiJIUzI1NiIsInR"))
                .and().log().all();
        Reporter.log("passed because token contain eyJhbGciOiJIUzI1NiIsInR");

    }
    @Test
    void LoginNegative(){
        JSONObject request = new JSONObject();
        request.put("username", "mor_231422");
        request.put("password", "83r5^_");

        String isiJson = request.toJSONString();
        //based on the website if the username is not available we would get error
        given().header("content-type", "application/json").contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(isiJson)
                .when()
                .post("/auth/login")
                .then().statusCode(401)
                .and().log().all();
        Reporter.log("passed because error");

    }
}
