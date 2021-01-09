package com.redisplus.service.controller;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class ServiceTest {

    @Test
    public void test1() {
        for (int i = 0; i < 100; i++) {

            System.out.println("ces");

        }
        Map<String, String> map = new HashMap<>();
        String test = map.put("001", "test");
        String test1 = map.put("002", "test");
        System.out.println(test);
        System.out.println(test1);
        System.out.println(map);
        String remove = map.remove(001);
        System.out.println(remove);

    }
}