package br.com.lepsistemas.gcp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello World!");
    }
}
