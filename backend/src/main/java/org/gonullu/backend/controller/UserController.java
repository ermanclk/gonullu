package org.gonullu.backend.controller;

import org.gonullu.backend.service.UserService;
import org.gonullu.backend.ws.model.request.UserDetailsRequestModel;
import org.gonullu.backend.ws.model.response.UserRest;
import org.gonullu.backend.ws.shared.dto.UserDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(path="/{userId}")
    public UserRest getUser(@PathVariable String userId) throws Exception {
        UserRest returnValue=new UserRest();

        UserDto userDto=userService.getUserByUserId(userId);
        BeanUtils.copyProperties(userDto,returnValue);
        return  returnValue;
    }
}