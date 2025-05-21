package com.example.demo.BankDemoPP.Controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class KpiPPControllerTest {

    @Autowired
    private KpiPPController controller;


    @Test
    public void contextLoads(){
        assertThat(controller).isNotNull();
    }
}

