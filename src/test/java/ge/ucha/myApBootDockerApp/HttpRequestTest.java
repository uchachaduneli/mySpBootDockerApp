package ge.ucha.myApBootDockerApp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void greetingShouldReturnDefaultMessage() throws Exception {
//        assertThat(false);
        String resp = this.restTemplate.getForObject("http://localhost:8080" + "/users/hello/ucha",
                String.class);
        System.out.println("Response is: " + resp);
        assertThat(resp).contains("hello");
    }
}
