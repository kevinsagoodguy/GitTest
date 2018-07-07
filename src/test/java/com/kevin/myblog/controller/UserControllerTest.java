package com.kevin.myblog.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;



@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MockServletContext.class)
@WebAppConfiguration
public class UserControllerTest {


    private MockMvc mvc;



    @Before
    public void setUp() throws Exception {
        mvc=MockMvcBuilders.standaloneSetup(new UserController()).build();
    }

    @Test
    public void getUserList() throws Exception {
        // 测试UserController
        RequestBuilder request=null;
        request=get("/users/");
        mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("[]")))
                .andDo(MockMvcResultHandlers.print());


    }

    @Test
    public void postUser() throws Exception {
        RequestBuilder request=null;
        request = post("/users/")
                .param("zz","212321")
                .param("id", "1")
                .param("name", "测试大师");

        mvc.perform(request)
                .andExpect(content().string(equalTo("success")))
                .andDo(MockMvcResultHandlers.print());
    }

    @Test
    public void getUser() {
    }

    @Test
    public void putUser() {
    }

    @Test
    public void deleteUser() {
    }
}