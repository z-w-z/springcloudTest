package com.example.simpleprovidermovie.feign;

import com.example.simpleprovidermovie.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName:
 * @Description:TODO
 * @Author: zwzheng
 * @Date: 20190608
 */
@FeignClient(name = "springcloud-eureka-user")
public interface UserFeignClient {
    @GetMapping("/user/{id}")
    User findById(@PathVariable("id") Long id);
}
