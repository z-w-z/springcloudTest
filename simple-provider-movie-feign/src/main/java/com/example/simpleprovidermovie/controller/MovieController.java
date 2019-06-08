package com.example.simpleprovidermovie.controller;

import com.example.simpleprovidermovie.entity.User;
import com.example.simpleprovidermovie.feign.UserFeignClient;
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
    private UserFeignClient userFeignClient;

    @GetMapping("/users/{id}")
    public User findById(@PathVariable Long id) {

        return this.userFeignClient.findById(id);
    }
}
