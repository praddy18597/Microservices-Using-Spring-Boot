package com.dailycodebuffer.user.service;

import com.dailycodebuffer.user.VO.Department;
import com.dailycodebuffer.user.VO.ResponseTemplateVO;
import com.dailycodebuffer.user.entity.User;
import com.dailycodebuffer.user.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;  //create object of UserRepository

    @Autowired
    private RestTemplate restTemplate;      // create object of RestTemplate

    public User saveUser(User user) {
        log.info("Inside saveUser of UserService");
        return userRepository.save(user);
    }

    public ResponseTemplateVO getUserWithDepartment(Long userId) {
        log.info("Inside getUserWithDepartment of UserService");
        // here we need to return ResponseTemplateVo
        ResponseTemplateVO vo = new ResponseTemplateVO();
        User user = userRepository.findByUserId(userId);   //we need to get user object
        // now with RestTemplate will call the department service and will get department object
        Department department =
                restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId()
                        ,Department.class);       //here will pass the URL and type of class
        vo.setUser(user); //we set user and department in VO
        vo.setDepartment(department);

        return vo;
    }

}

// what we did in last above method,
//we create a method to get a user with department and passing the userId.I'm getting the object from repository itself.
// with find by user id. then to get the department we need to call department service using the URL and
// then user id which we get from my user object.
// after all we getting user department object and we setting user and dept in VO. we return type VO