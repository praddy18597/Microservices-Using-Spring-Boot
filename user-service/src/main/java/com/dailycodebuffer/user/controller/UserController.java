package com.dailycodebuffer.user.controller;

import com.dailycodebuffer.user.VO.ResponseTemplateVO;
import com.dailycodebuffer.user.entity.User;
import com.dailycodebuffer.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j           //adding the loggers
public class UserController {
    @Autowired
    private UserService userService;    //create an object of UserController

    //will create method to save the user with the department itself
    @PostMapping("/")
    public User saveUser(@RequestBody User user){     //user object is entire request body
        log.info("Inside saveUser of UserController");  //adding the log info
        return userService.saveUser(user);
    }

    // create a method to get the user along with department which it belongs to
    // we need to create the wrapper object that will contain my both and department both. since we're calling dept service
    // will create one class that will contain both user and department object. (wrapper object)
    // we need to create department class

    //will use ResponseTemplateVO as return type so that i can return user and it's department
    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId){
        log.info("Inside getUserWithDepartment of UserController");
        return userService.getUserWithDepartment(userId);

    }


}
