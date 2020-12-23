package org.example.rest.json.quickstart;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
@QuarkusTest
public class LegumeResourceTest {

    @Test
    public void legumelistTest(){

        given().when().get("/legumes")
                .then().statusCode(200)
                .body(is("[{\"name\":\"Carrot\",\"description\":\"Root vegetable, usually orange\"},{\"name\":\"Zucchini\",\"description\":\"Summer squash\"}]")) ;
    }

}
