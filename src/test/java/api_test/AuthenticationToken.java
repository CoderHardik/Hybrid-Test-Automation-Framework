package api_test;

import io.restassured.RestAssured; // Updated to io.restassured
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import java.util.HashMap;
import java.util.Map;

public class AuthenticationToken {

    /**
     * Retrieves the base URL based on the 'env' Maven property.
     * Default is 'qa' if no property is provided.
     */
    public static String getBaseUri() {
        String env = System.getProperty("env", "qa").toLowerCase();
        
        // Use a switch or a simple map for cleaner environment management
        switch (env) {
            case "prod":
            case "qa":
            default:
                return "https://reqres.in";
        }
    }

    /**
     * Obtains an authentication token using demo credentials.
     * Demonstrates use of Map for payload and RestAssured best practices.
     */
    public static String getToken() {
        RestAssured.baseURI = getBaseUri();

        // Using a Map is cleaner than manual JsonObject manipulation for simple payloads
        Map<String, String> loginPayload = new HashMap<>();
        loginPayload.put("email", "eve.holt@reqres.in");
        loginPayload.put("password", "cityslicka");

        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(loginPayload)
            .when()
                .post("/api/login")
            .then()
                .statusCode(200) // Shows you validate status codes during auth
                .extract()
                .response();

        return response.path("token"); // path() is a shorthand for JsonPath
    }
}
