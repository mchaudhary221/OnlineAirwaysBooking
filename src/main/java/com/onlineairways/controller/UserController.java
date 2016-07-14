/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onlineairways.controller;

import com.onlineairways.domain.User;
import com.onlineairways.service.IUserService;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Administrator
 */
@Controller
public class UserController {

    @Autowired
    private IUserService service;

    @RequestMapping(value = {"/login"}, method = RequestMethod.GET)
    public String getLoginForm() {
        return "login";
    }

    @RequestMapping(value = {"/login"}, method = RequestMethod.POST)
    public String login(User user, HttpServletRequest request) {
        if (service.authenticate(user)) {
            request.getSession().setAttribute("user", user);
            return "redirect:/booking";
        } else {
            return "login";
        }
    }

    @RequestMapping(value = {"/register"}, method = RequestMethod.GET)
    public String getRegisterForm(Model model) {
        model.addAttribute("registerUser", new User());
        return "register";
    }

    @RequestMapping(value = {"/register"}, method = RequestMethod.POST)
    public String register(@ModelAttribute("registerUser") @Valid User newUser, BindingResult result) {
        if (result.hasErrors()) {
            return "register";
        }

        if (service.register(newUser)) {
            return "redirect:/booking";
        } else {
            return "register";
        }
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpServletRequest request) {
        request.getSession().invalidate();
        return "login";
    }
}
