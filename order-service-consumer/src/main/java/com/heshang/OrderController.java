package com.heshang;

import entity.Users;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author 微信公众号《和尚的破功之路》
 * @date 2021/11/15 15:27
 * version: 1.0
 */
@RestController
@Slf4j
public class OrderController {

    @Reference
    private UserService userService;

    @GetMapping("/demo")
    public String demoController() {
        log.error("消费者 OK");
        int demo = userService.register(Users.builder().username("demo").phone("123").uid(11).build());
        if (demo == -1) {
            return "ok";
        }
        return "not ok";
    }
}
