package com.heshang;

import entity.Users;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;

/**
 * TODO
 *
 * @author 微信公众号《和尚的破功之路》
 * @date 2021/11/15 11:32
 * version: 1.0
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {


    @Override
    public int register(Users users) {
        log.error("进入了提供者方法");
        return -1;
    }
}
