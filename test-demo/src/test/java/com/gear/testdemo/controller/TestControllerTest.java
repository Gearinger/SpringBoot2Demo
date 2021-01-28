package com.gear.testdemo.controller;

import com.gear.testdemo.TestDemoApplication;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class TestControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    void test1() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/test1").accept(MediaType.ALL))
                .andExpect(status().isOk())
                .andExpect(content().string("~~~~~~~~~~~~~~"));
    }

    @Test
    void testException() {
    }

    @Test
    void testException3() {
    }

    @Test
    void testException4() {
    }

    @Test
    void testException5() {
    }
}