import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class user {
    @BeforeTest
    public void uri(){
        baseURI = "https://fakestoreapi.com";
    }
    @Test
    void AllUserPositive(){
        //get all users
        given().get("/users").then()
                .statusCode(200)
                .body("[0].username", equalTo("johnd"))
                .and()
                .body("size()", is(10)).log().all();
        Reporter.log("passed because status code = 200 ,first username is johnd, and size is 10");
    }
    @Test
    void SpecificUserPositive(){
        //get users with id 1
        given().get("/users/1").then().
                statusCode(200)
                .body("id", equalTo(1))
                .and().log().all();
        Reporter.log("passed because status code = 200 and id = 1");

    }
    @Test
    void SpecificUserNegative(){
        //get user with id -1, this shouldve passed but Assertion error
        given().get("/users/-1").then().
                statusCode(200).body(equalTo(null)).log().all();
        Reporter.log("passed because status code = 200 and has 0 body");
    }
    @Test
    void LimitUserPositive(){
        //set limit to show user
        given().get("/users?limit=5").then().
                statusCode(200).body("[5].id", equalTo(null)).log().all();
        Reporter.log("passed because array 5 has nothing (no id)");
    }
    @Test
    void LimitUserNegative(){
        //set limit user to -5, shouldve shown nothing
        given().get("/users?limit=-5").then().
                statusCode(200).body(isEmptyString()).log().all();
        Reporter.log("passed because array shown nothing");
    }
    @Test
    void SortUserPostive(){
        //sort user descending
        given().get("/users?sort=desc").then().
                statusCode(200).body("[0].id", equalTo(10))
                .log().all();
        Reporter.log("ID starts at 10 (the bottom list instead of the top)");
    }
    @Test
    void SortUserNegative(){
        //sort user with wrong param
        given().get("/users?sort=desc0").then().
                statusCode(200).body(Matchers.emptyArray())
                .log().all();
        Reporter.log("passed because Empty Body");
    }
    @Test
    void AddUserPositive(){
        // create a new JSONObject to hold the data
        JSONObject json = new JSONObject();

        // add the values to the JSONObject
        JSONObject address = new JSONObject();
        JSONObject geolocation = new JSONObject();
        geolocation.put("lat", "-0");
        geolocation.put("long", "0");
        address.put("geolocation", geolocation);
        address.put("city", "Jakarta");
        address.put("street", "Cengkareng");
        address.put("number", 7682);
        address.put("zipcode", "12926-3874");
        json.put("address", address);
        json.put("email", "Dimas@gmail.com");
        json.put("username", "dimasrens");
        json.put("password", "rens02");
        JSONObject name = new JSONObject();
        name.put("firstname", "dimas");
        name.put("lastname", "sriwirawan");
        json.put("name", name);
        json.put("phone", "081218446131");


        // print the resulting JSONObject
        System.out.println(json.toString());
        String isiJson = json.toJSONString();
        // based on the website, the reply should be id 21 and username as in the data we entry
        given().header("content-type", "application/json").contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(isiJson)
                .when()
                .post("/users")
                .then().log().all().and()
                .assertThat().body("id", equalTo(21))
                .and().body("username", equalTo("dimasrens"));
    }
    @Test
    void PutUserPositive(){
        // create a new JSONObject to hold the data
        JSONObject json = new JSONObject();

        // add the values to the JSONObject
        JSONObject address = new JSONObject();
        JSONObject geolocation = new JSONObject();
        json.put("username", "dimasrens");
        json.put("password", "rens02");



        // print the resulting JSONObject
        System.out.println(json.toString());
        String isiJson = json.toJSONString();
        // based on the website, the reply should be the same id(7) and username as in the data we entry
        given().header("content-type", "application/json").contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(isiJson)
                .when()
                .put("/users/7")
                .then().log().all().and()
                .assertThat().body("id", equalTo(7))
                .and().body("username", equalTo("dimasrens")).log().all();
    }
    @Test
    void DeleteUsersPositive() {

        given().header("content-type", "application/json")
                .delete("/users/7")
                .then()
                .body("id", equalTo(7)).log().all();
        Reporter.log("passed because return the product as in the test documentation said");
        Reporter.log("The product will not be deleted on the database. but if you sent data successfully it will return you the fake deleted product.");
    }

}
