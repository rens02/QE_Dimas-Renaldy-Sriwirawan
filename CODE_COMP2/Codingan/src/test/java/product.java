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
        baseURI = "https://fakestoreapi.com";
    }
    @Test
    void AllProductPositive(){

        given().get().then().
                statusCode(200);
        Reporter.log("passed because status code = 200");
    }
    @Test
    void SpecificProductPositive(){

        given().get("/products/1").then().
                statusCode(200)
                .body("id", equalTo(1));
        Reporter.log("passed because status code = 200 and id = 1");

    }
    @Test
    void SpecificProductNegative(){

        given().get("/products/-1").then().
                statusCode(200).body(isEmptyString());
        Reporter.log("passed because status code = 200 and has 0 body");
    }
    @Test
    void LimitProductPositive(){

        given().get("/products?limit=5").then().
                statusCode(200).body("[5].id", equalTo(null));
        Reporter.log("passed because array 5 has nothing (no id)");
    }
    @Test
    void LimitProductNegative(){

        given().get("/products?limit=-5").then().
                statusCode(200).body(isEmptyString());
        Reporter.log("passed because array shown nothing");
    }
    @Test
    void SortProductPostive(){

        given().get("/products?sort=desc").then().
                statusCode(200).body("[0].id", equalTo(20));
        Reporter.log("ID starts at 20 (the bottom list instead of the top)");
    }
    @Test
    void SortProductNegative(){

        given().get("/products?sort=desc0").then().
                statusCode(200).body(Matchers.emptyArray());
        Reporter.log("pased Empty Body");
    }
    @Test
    void CategoryProductPostive(){

        given().get("/products/categories").then().
                statusCode(200)
                .body("[0]", equalTo("electronics"))
                .body("[1]", equalTo("jewelery"))
                .body("[2]", equalTo("men's clothing"))
                .body("[3]", equalTo("women's clothing"));
        Reporter.log("passed because body is all the category");
    }
    @Test
    void CategoryProductNegative(){

        given().get("/products/categories-1").then().
                statusCode(200).body(isEmptyString());
        Reporter.log("passed because empty");
    }
    @Test
    void specificCategoryProductPostive(){

        given().get("/products/category/jewelery").then()
                .statusCode(200)
                .body("[0].category", equalTo("jewelery"))
                .body("[1].category", equalTo("jewelery"))
                .body("[2].category", equalTo("jewelery"));
        Reporter.log("passed because category is jewelery");
    }
    @Test
    void specificCategoryProductNegative(){

        given().get("/products/category/jewelery-1").then().
                statusCode(200).body("", Matchers.hasSize(0));
        Reporter.log("passed because empty");
    }
    @Test
    void AddProductPostive(){

        JSONObject request = new JSONObject();
        request.put("title", "test product");
        request.put("image", "ampuh");
        request.put("price", 13.5);
        request.put("description", "lorem ipsum set");
        request.put("image", "ampuh");
        request.put("category", "electronic");
        String isiJson = request.toJSONString();

        given().header("content-type", "application/json").contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(isiJson)
                .when()
                .post("/products")
                .then()
                .assertThat().body("title", equalTo("test product"))
                .and().log().all();
        Reporter.log("passed because new item name is the same as test data");

    }
    @Test
    void AddProductNegative(){


        JSONObject request = new JSONObject();
        request.put("title", "test product");
        request.put("image", "ampuh");
        request.put("price", -13.500);
        request.put("description", "lorem ipsum set");
        request.put("image", "ampuh");
        request.put("category", "electronics64");
        String isiJson = request.toJSONString();

        given().header("content-type", "application/json").contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(isiJson)
                .when()
                .post("/products")
                .then()
                .assertThat().body("category", equalTo("electronic"))
                .and().log().all();
        Reporter.log("passed because Auto Correct");
    }
    @Test
    void UpdateProductPostive(){


        JSONObject request = new JSONObject();
        request.put("title", "test update");
        request.put("image", "ampuh");
        request.put("price", 13.5);
        request.put("description", "lorem ipsum set");
        request.put("image", "ampuh");
        request.put("category", "electronic");
        String isiJson = request.toJSONString();

        given().header("content-type", "application/json").contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(isiJson)
                .when()
                .put("/products/7")
                .then()
                .assertThat().body("title", equalTo("test update"))
                .and().log().all();


    }
    @Test
    void UpdateProductNegative(){
        JSONObject request = new JSONObject();
        request.put("title", "test product");
        request.put("image", "ampuh");
        request.put("price", -13.500);
        request.put("description", "lorem ipsum set");
        request.put("image", "ampuh");
        request.put("category", "electronic");
        String isiJson = request.toJSONString();

        given().header("content-type", "application/json").contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(isiJson)
                .when()
                .put("/products/-7")
                .then()
                .assertThat().body(isEmptyString())
                .and().log().all();
        Reporter.log("passed because body is empty");
    }
    @Test
    void DeleteProductPositive() {

        given().header("content-type", "application/json")
                .delete("/products/7")
                .then()
                .body("id", equalTo(7));
        Reporter.log("passed because return the product as in the test documentation said");
        Reporter.log("The product will not be deleted on the database. but if you sent data successfully it will return you the fake deleted product.");
    }
}
