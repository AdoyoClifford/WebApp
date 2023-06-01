package com.adoyo.springboot.webapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class LogInController {

    private AuthenticateService authenticateService;

    public LogInController(AuthenticateService authenticateService) {
        this.authenticateService = authenticateService;
    }

    @GetMapping(value = "login")
    public String gotoLoginPage() {
        return "logIn";
    }

    @PostMapping(value = "login")
    public String gotoWelcomePage(@RequestParam String name, @RequestParam String password,  ModelMap model) {

        if (authenticateService.authenticate(name, password)) {
            model.put("name",name);
            return "welcome";
        }
        model.put("errorMessage","Invalid logIn credentials");
        return "logIn";
    }
}
