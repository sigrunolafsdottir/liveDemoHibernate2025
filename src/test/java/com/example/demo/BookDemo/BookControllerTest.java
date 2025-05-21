package com.example.demo.BookDemo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


//Här testar vi att anrop till en viss url ger förväntat svar
//Vi drar igång webbservern och behöver därför en port som den kan köra på
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class BookControllerTest {

    @Value(value="${local.server.port}")
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;


    @Test
    void hello() {
        System.out.println(restTemplate.getForObject("http://localhost:"+port+"/hello", String.class));

        assertThat(restTemplate.getForObject("http://localhost:"+port+"/hello", String.class))
                .contains("Hello World");
    }

}