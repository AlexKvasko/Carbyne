import io.restassured.RestAssured;

public class BaseTest {
    public BaseTest() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }
}
