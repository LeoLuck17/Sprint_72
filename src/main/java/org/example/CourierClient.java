import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;

public class CourierClient {

    private static final String PATH = "/api/v1/courier";

    public ValidatableResponse create(Courier courier){
        return given()
                .spec()
                .body(courier)
                .when()
                .post(PATH)
                .then();
    }
}
