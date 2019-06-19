package com.wugou.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author xuett
 * @Date 2019/6/18 10:37
 */
@RestController
public class HwController {

    @GetMapping("/hw")
    public String hw() {
        return "你好，五狗 ！你要是乖，给你买条街，要是不乖，给你头打歪";
    }
}
