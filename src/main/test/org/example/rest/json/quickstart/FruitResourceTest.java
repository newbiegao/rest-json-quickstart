package org.example.rest.json.quickstart ;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;


@QuarkusTest
public class FruitResourceTest {

    @Test
    public void fruitListTest(){

        given().when().get("/fruits")
                .then().statusCode(200)
                .body(is("[{\"name\":\"Apple\",\"description\":\"Winter fruit\"},{\"name\":\"Pineapple\",\"description\":\"Tropical fruit\"}]")) ;
    }

}
