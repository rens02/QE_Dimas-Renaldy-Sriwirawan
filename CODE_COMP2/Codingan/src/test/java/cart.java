import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class cart {

    @BeforeTest
    public void uri() {
        baseURI = "https://fakestoreapi.com";
    }
    @Test
    void AllcartsPositive() {
        // based on the website we would get all item from the cart but here i only use the ID to compare and status code 200

        given().get("/carts")
                .then()
                .statusCode(200).body("[0].id", equalTo(1)).log().all();
        Reporter.log("passed because status code = 200");
    }
    @Test
    void SpecificcartPositive() {
        //get item with id 1 and check if status code is 200
        given().get("/carts/1").then().
                statusCode(200)
                .body("id", equalTo(1)).log().all();
        Reporter.log("passed because status code = 200 and id = 1");
    }

    @Test
    void SpecificcartNegative() {
        //get cart with id -1, it should reply with null and status code 200
        //this test should've passed, but the Assertion gives an error
        given().get("/carts/-1").then().
                statusCode(200).log().all().body(equalTo(null));
        Reporter.log("passed because status code = 200");
    }

    @Test
    void LimitcartPositive() {
        //show the cart limited to only 5 id, array 5 (id 6) should be empty
        given().get("/carts?limit=5").then().
                statusCode(200).body("[5].id", equalTo(null)).log().all();
        Reporter.log("passed because array 5 has nothing (no id)");
    }

    @Test
    void LimitcartNegative() {
        //negative limits should show nothing at all
        given().get("/carts?limit=-5").then().
                statusCode(200).body(isEmptyString()).log().all();
        Reporter.log("passed because array shown nothing");
    }

    @Test
    void SortcartPostive() {
        //get cart by descending
        given().get("/carts?sort=desc").then().
                statusCode(200).body("[0].id", equalTo(7))
                .log().all();
        Reporter.log("ID starts at 7 (the bottom list instead of the top)");
    }

    @Test
    void SortcartNegative() {
        //get cart by wrong sort, shoul return nothing
        given().get("/carts?sort=desc0").then().
                statusCode(200).body(Matchers.emptyArray())
                .log().all();
        Reporter.log("passed because Empty Body");
    }

    @Test
    void CartDatePostive() {
        //get the cart based on date
        given().get("/carts?startdate=2020-03-01&enddate=2020-03-03").then().
                statusCode(200)
                .body("[0].date", equalTo("2020-03-02T00:00:00.000Z"))
                .body("[1].date", equalTo("2020-03-01T00:00:00.000Z"))
                .log().all();
        Reporter.log("passed because date on array 0 is 2020-03 02 and on array 1 s 2020-03-01");
    }

    @Test
    void CartDateNegative() {
        //try it with 00 in the date
        given().get("/carts?startdate=2020-03-01&enddate=2020-03-00").then().
                statusCode(400)
                .body("status", equalTo("error"))
                .log().all();
        Reporter.log("passed because shown code 400 and status error");
    }

    @Test
    void UserCartPostive() {
        //should return user with id 2
        given().get("/carts/user/2").then()
                .statusCode(200)
                .log().all();
        Reporter.log("passed because status code 200");
    }

    @Test
    void UserCartNegative() {
        //should return error because negative id
        given().get("/carts/user/-2").then()
                .statusCode(400)
                .log().all();
        Reporter.log("passed because status code 400 (error)");
    }

    @Test
    void AddCartPostive() {

        JSONObject request = new JSONObject();
        request.put("userId", "5");
        request.put("date", "2023-04-16");
        request.put("products", "[{productId:5,quantity:1},{productId:1,quantity:5}]");

        String isiJson = request.toJSONString();

        given().header("content-type", "application/json").contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(isiJson)
                .when()
                .post("/carts")
                .then()
                .assertThat().body("userId", equalTo("5"))
                .and().log().all();
        Reporter.log("passed because userID 5 is added");
    }

    @Test
    void AddCartNegative() {

        JSONObject request = new JSONObject();
        request.put("userId", "5");
        request.put("date", "-2023-04-16-");
        request.put("products", "[{productId:5,quantity:1},{productId:1,quantity:5}]");

        String isiJson = request.toJSONString();

        given().header("content-type", "application/json").contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(isiJson)
                .when()
                .post("/carts")
                .then()
                .statusCode(400)
                .assertThat().body("userId", equalTo("5"))
                .and().log().all();
        Reporter.log("passed because error");
    }

    @Test
    void UpdateCartPositive() {

        JSONObject request = new JSONObject();
        request.put("userId", 3);
        request.put("date", "2023-04-16");
        request.put("products", "[{productId:5,quantity:1},{productId:1,quantity:5}]");

        String isiJson = request.toJSONString();

        given().header("content-type", "application/json").contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(isiJson)
                .when()
                .put("/carts/7")
                .then()
                .statusCode(200)
                .assertThat().body("userId", equalTo(3))
                .and().log().all();
        Reporter.log("passed because edited");
    }

    @Test
    void UpdateCartNegative() {
        //updating cart with bad date, shouldve return 400 status code (error)
        JSONObject request = new JSONObject();
        request.put("userId", 3);
        request.put("date", -2023-04-16);
        request.put("products", "[{productId:5,quantity:1},{productId:1,quantity:5}]");

        String isiJson = request.toJSONString();

        given().header("content-type", "application/json").contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(isiJson)
                .when()
                .put("/carts/7")
                .then()
                .statusCode(400)
                .and().log().all();
        Reporter.log("passed because error");
    }

    @Test
    void DeleteCartPositive() {

        given().header("content-type", "application/json")
                .delete("/carts/6")
                .then()
                .body("id", equalTo(6))
                .and().log().all();
        Reporter.log("Passed if return the product as in the test documentation said");
        Reporter.log("The product will not be deleted on the database. but if you sent data successfully it will return you the fake deleted product.");
    }
}
