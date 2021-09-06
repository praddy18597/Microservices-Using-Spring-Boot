package com.dailycodebuffer.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    //when user or dept microservice is slow or failed or taking longer time we call this fallback methods
    @GetMapping("/userServiceFallBack")
    public String userServiceFallBackMethod() {
        return "User service is taking longer than expected." + "Please try again later";
    }

    @GetMapping("/departmentServiceFallBack")
    public String departmentServiceFallBackMethod() {
        return "Department service is taking longer than expected." + "Please try again later";

    }
}
