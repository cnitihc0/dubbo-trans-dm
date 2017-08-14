package com.trans.test;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;


public class AppTest {

    @Before
    public void before() {
        com.alibaba.dubbo.container.Main.main(null);
    }

    @Test
    public void testGreetingArray() throws IOException {
//        try (CloseableHttpClient httpClient = HttpClientBuilder.create().build()) {
//            HttpGet getRequest = new HttpGet(url + "/greeting?names=dinghz,dinghz1");
//
//            Greeting greeting = HttpClientHelper.executeToJson(httpClient, getRequest, Greeting.class);
//
//            Assert.hasText(greeting.getContent(), "dinghz1");
//        }
    }

    @After
    public void after() {
    }

}
