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

    Logger liugoulogger = LoggerFactory.getLogger("liugoulog");

    @GetMapping("/hw")
    public String hw() {
        logger.error("这是一条日志");
        liugoulogger.info("这是一条日志");
        return "hello,world";
    }

}
