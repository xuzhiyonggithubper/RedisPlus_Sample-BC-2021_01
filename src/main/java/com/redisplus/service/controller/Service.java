package com.redisplus.service.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Service {

    private static final Logger LOG = LoggerFactory.getLogger(Service.class);

    private static Map<String, String> map = new HashMap<>();

    @RequestMapping(path = "/get", method = RequestMethod.POST)
    public String get(@RequestBody Map<String, String> m) {
        try {
            return map.get(m.get("key"));
        } catch (Exception e) {
            LOG.error(e.getMessage());
            return "error";
        }
    }

    @RequestMapping(path = "/set", method = RequestMethod.POST)
    public boolean set(@RequestBody Map<String, String> m) {
        try {
            map.put(m.get("key"), m.get("value"));
            return true;
        } catch (Exception e) {
            LOG.error(e.getMessage());
            return false;
        }
    }

    @RequestMapping(path = "/delete", method = RequestMethod.POST)
    public boolean delete(@RequestBody Map<String, String> m) {
        try {
            map.remove(m.get("key"));
            return true;
        } catch (Exception e) {
            LOG.error(e.getMessage());
            return false;
        }
    }
}