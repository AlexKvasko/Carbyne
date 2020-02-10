import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static com.carbyne.api.Endpoints.IP_JSON_TEST;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

public class IpTest extends BaseTest {

    @Test(description = "Verify that ip endpoint returns error code 503")
    public void ipTest() {
        given().get(IP_JSON_TEST).then().statusCode(503).and().time(lessThan(5L), TimeUnit.SECONDS).log().all();
    }
}
