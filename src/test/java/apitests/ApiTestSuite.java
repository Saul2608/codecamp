package apitests;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class ApiTestSuite {
    @Test
    public void TestStatus(){

        given().
                param("q", "Tascott").and().header("auth-key", "ba1a2626-4e1f-48e6-a69d-e16ee7d90193").
        when().
                get("https://digitalapi.auspost.com.au/postcode/search.json").
        then().
                assertThat().statusCode(200);
    }

    @Test
    public void TestPostcode(){
        given().
                param("q", "Tascott").and().header("auth-key", "ba1a2626-4e1f-48e6-a69d-e16ee7d90193").
        when().
                get("https://digitalapi.auspost.com.au/postcode/search.json").
        then().
                assertThat().statusCode(200).and().assertThat().body("localities.locality.postcode",equalTo(2250));
    }
}
