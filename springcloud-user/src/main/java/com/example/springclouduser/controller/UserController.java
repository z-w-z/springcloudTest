package com.example.springclouduser.controller;


import com.example.springclouduser.entity.User;
import com.example.springclouduser.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


/**
 * @ClassName:
 * @Description:TODO
 * @Author: zwzheng
 * @Date: 20190529
 */
@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    private UserRepository repository;

    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable Long id) {

        return this.repository.findById(id);
    }

    @PostMapping("/insertInfo")
    public String insert(User user) {


        String msg = "插入成功";
        return msg;
    }
}
