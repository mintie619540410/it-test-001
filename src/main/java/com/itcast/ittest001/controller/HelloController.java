package com.itcast.ittest001.controller;

import com.alibaba.fastjson2.JSON;
import com.itcast.ittest001.vo.MyProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/")
@RestController
public class HelloController {

    @Autowired
    private MyProperties myProperties;


    @Value("${good.item-name}")
    private String itemName;

    @Value("${good.item-desc}")
    private String itemDesc;

    @Value("${redis.version}")
    private String redisVersion;

    @RequestMapping("/index")
    public String sayHello(){
        Map<String,Object> map = new HashMap<>();
        map.put("name",itemName);
        map.put("desc",itemDesc);
        map.put("redis-version",redisVersion);

        return JSON.toJSONString(map);
    }

    @GetMapping("/test")
    public Object test(){
        return JSON.toJSONString(myProperties);
    }
}
