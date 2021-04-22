package br.com.lepsistemas.gcp;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {

    @Test
    public void shouldReturnOkAndHelloWorld() {
        HelloController controller = new HelloController();

        ResponseEntity<String> response = controller.hello();

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("Hello World!", response.getBody());
    }

}