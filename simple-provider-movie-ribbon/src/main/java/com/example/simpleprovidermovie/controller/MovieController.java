package com.example.simpleprovidermovie.controller;

import com.example.simpleprovidermovie.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName:
 * @Description:TODO
 * @Author: zwzheng
 * @Date: 20190607
 */
@RequestMapping("/movies")
@RestController
public class MovieController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/users/{id}")
    public User findById(@PathVariable Long id) {
        // 这里用到了RestTemplate的占位符能力
        User user = this.restTemplate.getForObject("http://springcloud-eureka-user/user/{id}", User.class, id);
        // ...电影微服务的业务...
        return user;
    }

}
