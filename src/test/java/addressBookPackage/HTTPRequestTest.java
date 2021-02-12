package addressBookPackage;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HTTPRequestTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void greetingShouldReturnDefaultMessage() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/",
                String.class)).contains("Hello, World");
    }

    @Test
    public void addBuddyTest() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/addBuddy",
                String.class)).contains("addBuddy");
    }

    @Test
    public void addressBookTest() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/addressbook",
                String.class)).contains("addressbook");
    }

    @Test
    public void removeBuddyTest() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/removeBuddy",
                String.class)).contains("removeBuddy");
    }
}