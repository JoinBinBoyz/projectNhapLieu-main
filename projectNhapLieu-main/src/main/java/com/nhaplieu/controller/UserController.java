package com.nhaplieu.controller;



import java.util.Objects;

import com.nhaplieu.domain.User;
import com.nhaplieu.service.UserService;
import com.nhaplieu.utils.SessionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("login")
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
	SessionService sessionService;

    @GetMapping("")
    public String index() {
        return "login";
    }

    @PostMapping("")
    public String loginPost(@ModelAttribute("users") User users,Model model) {
        String sn = users.getUsername();
        String pas = users.getPassword();
        try {
            User user =userService.login(sn, pas);
            if (Objects.isNull(user)) {
                model.addAttribute("message", "Wrong Password!");
            } else {
                model.addAttribute("message", "Login Successfully");
                sessionService.set("user", user);
                if (user.getRole().equals("1")) {
                    model.addAttribute("message", user.getUsername() );
                    return "redirect:list/"+1;
                } else {
                    return "redirect:login";
                }
            }

        } catch (Exception e) {
			model.addAttribute("message", "Account is invalid!");
        }
        return "login";
    }
}
