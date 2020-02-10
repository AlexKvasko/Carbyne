import com.carbyne.api.ExternalServices;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThan;

public class ExternalServiceTest extends BaseTest {

    ExternalServices externalServices = new ExternalServices();

    @Test(description = "Verify health check service is available with correct server")
    public void healthCheck() {
        externalServices.getHealthCheck().then()
                .statusCode(200)
                .header("Server", is("akka-http/10.1.7"))
                .time(lessThan(5L), TimeUnit.SECONDS)
                .log().all();

    }
}
