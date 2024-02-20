package com.example.springhw2.controller;

import com.example.springhw2.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
public class UserListController {

    private final UserService userService;

    @GetMapping("/users")
    public ModelAndView showUserList(ModelAndView modelAndView) {
        modelAndView.setViewName("users");
        modelAndView.getModel().put("allUsers", userService.getAllUsers());
        return modelAndView;
    }
}