package com.example.blog.controller;

import com.example.blog.app.service.UserApplicationService;
import com.example.blog.form.SignupForm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Controller
@RequestMapping("/user")
@Slf4j
public class SignupController {

    @Autowired
    UserApplicationService userApplicationService;

    @Autowired
    private MessageSource messageSource;

    @GetMapping("/signup")
    public String getSignup(Model model, @ModelAttribute("user") SignupForm form)
    {
//        Map<String, Integer> genderMap = userApplicationService.getGenderMap();
        Set<Map.Entry<String, Integer>> genderMap = userApplicationService.getGenderMap().entrySet();
        model.addAttribute("genderMap", genderMap);

        Map<String, String> localMessages = new HashMap<>();
        localMessages.put("user.signup.title", messageSource.getMessage("user.signup.title",
                null, LocaleContextHolder.getLocale()));

        localMessages.put("user.signup.btn", messageSource.getMessage("user.signup.btn",
                null, LocaleContextHolder.getLocale()));

        localMessages.put("userId", messageSource.getMessage("userId",
                null, LocaleContextHolder.getLocale()));

        localMessages.put("password", messageSource.getMessage("password",
                null, LocaleContextHolder.getLocale()));

        localMessages.put("userName", messageSource.getMessage("userName",
                null, LocaleContextHolder.getLocale()));

        localMessages.put("birthday", messageSource.getMessage("birthday",
                null, LocaleContextHolder.getLocale()));

        localMessages.put("age", messageSource.getMessage("age",
                null, LocaleContextHolder.getLocale()));

        model.addAttribute("localeMessages", localMessages);

        return "user/signup";
    }

    @PostMapping("/signup")
    public String postSignup(@ModelAttribute("user") SignupForm form)
    {
        log.info(form .toString());
        return "redirect:/login";
    }
}
