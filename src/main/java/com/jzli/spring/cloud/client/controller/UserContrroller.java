package com.jzli.spring.cloud.client.controller;

import com.jzli.spring.cloud.client.bean.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * =======================================================
 *
 * @Company 金色家网络科技有限公司-开发测试云服务部
 * @Date ：2016/7/6
 * @Author ：li.jinzhao
 * @Version ：0.0.1
 * @Description ：
 * ========================================================
 */
@RestController
public class UserContrroller {
    private AtomicInteger counter = new AtomicInteger();


    @RequestMapping(value = "/user/{name}", method = RequestMethod.GET)
    public String getUser(@PathVariable("name") String name) {
        User user = new User(counter.getAndIncrement(), name);
        return user.toString();
    }

}
