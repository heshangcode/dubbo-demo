package com.heshang;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author 微信公众号《和尚的破功之路》
 * @date 2021/11/15 11:41
 * version: 1.0
 */
@RestController
public class DemoController {

    @RequestMapping("/")
    public String demo() {
        return "demo";
    }
}
