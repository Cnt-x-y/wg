package com.wugou.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author xuett
 * @Date 2019/6/18 10:37
 */
@RestController
public class HwController {

    Logger logger = LoggerFactory.getLogger("wugoulog");

    @GetMapping("/hw")
    public String hw() {
        logger.error("你好，五狗 ！你要是乖，给你买条街，要是不乖，给你头打歪");
        return "你好，五狗 ！你要是乖，给你买条街，要是不乖，给你头打歪";
    }
}
