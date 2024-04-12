package com.lalulla.lakubosbx;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MainWebControllerTest {

    @Autowired
	private TestRestTemplate template;

    @Value("${spring.security.user.password}")
    private String temporaryPassword;

    @Test
    public void getIndex() throws Exception {
        //ResponseEntity<String> response = template.getForEntity("/", String.class);
        
        //Using password to test
        ResponseEntity<String> response = template.withBasicAuth("user", "password" )
                .getForEntity("/", String.class);
        assertThat(response.getBody()).isEqualTo("Greetings from Spring Boot!");
    }


}