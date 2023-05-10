import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class product {
    @BeforeTest
    public void uri(){
        baseURI = "https://jsonplaceholder.typicode.com/posts";
    }

    @Test
    void AllProductPositive(){

        given().get().then().
                statusCode(200);
        Reporter.log("passed because status code = 200");
    }

    @Test
    void SpecificProductPositive(){

        given().get("?id=3").then().
                statusCode(200)
                .body("[0].id", equalTo(3));
        Reporter.log("passed because status code = 200 and id = 3");

    }
    @Test
    void SpecificProductNegative(){

        given().get("?id=-101").then().
                statusCode(200).body(equalTo("[]"));
        Reporter.log("passed because status code = 200 and has 0 body");
    }

    @Test
    void AddProductPostive(){

        JSONObject request = new JSONObject();
        request.put("title", "test product");
        request.put("body", "ampuh");
        request.put("userId", 55);
        String isiJson = request.toJSONString();

        given().header("content-type", "application/json").contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(isiJson)
                .when()
                .post()
                .then()
                .assertThat().body("title", equalTo("test product"))
                .and().log().all();
        Reporter.log("passed because new item name is the same as test data");

    }
    @Test
    void AddProductNegative(){


        JSONObject request = new JSONObject();
        request.put("title", "test product");
        request.put("body", "ampuh");
        request.put("userId", -55);
        String isiJson = request.toJSONString();

        given().header("content-type", "application/json").contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(isiJson)
                .when()
                .post()
                .then()
                .assertThat().body("userId", equalTo(-55))
                .and().log().all();
        Reporter.log("passed because within the int range");
    }

    @Test
    void UpdateProductPostive(){


        JSONObject request = new JSONObject();
        request.put("userId", 55);
        request.put("id", 1);
        request.put("title", "Dimas Renaldy S");
        request.put("body", "adalah seorang mahasiswa gunadarma");

        String isiJson = request.toJSONString();

        given().header("content-type", "application/json").contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(isiJson)
                .when()
                .put("/1")
                .then().log().all().and()
                .assertThat().body("title", equalTo("Dimas Renaldy S"));



    }
    @Test
    void UpdateProductNegative(){
        JSONObject request = new JSONObject();
        request.put("userId", -55);
        request.put("id", -1);
        request.put("title", "Dimas Renaldy S");
        request.put("body", "adalah seorang mahasiswa gunadarma");

        String isiJson = request.toJSONString();

        given().header("content-type", "application/json").contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(isiJson)
                .when()
                .put("/1")
                .then()
                .assertThat().body("id", equalTo(1))
                .and().log().all();
        Reporter.log("passed because self corrected");
    }
    @Test
    void DeleteProductPositive() {

        given().header("content-type", "application/json")
                .delete("/1")
                .then().assertThat()
                .body(equalTo("{}"));
        Reporter.log("passed because return the product as in the test documentation said");
        Reporter.log("The product will not be deleted on the database. but if you sent data successfully it will return you the fake deleted product.");
    }
}
