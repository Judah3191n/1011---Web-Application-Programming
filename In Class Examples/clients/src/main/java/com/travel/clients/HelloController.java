package com.travel.clients;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/client")
    public String getHello(Model model) {

        ArrayList<User> Users = new ArrayList<User>();
        Users.add(new User("Judah", "P@ssword1"));
        Users.add(new User("Jeremy", "ASecret"));
        Users.add(new User("Nadia", "Uncrackable"));
        Users.add(new User("David", "help"));
        Users.add(new User("Jalen", "yellow submarine"));

        model.addAttribute("msg", "List of the Clients");
        model.addAttribute("date", LocalDate.now());
        model.addAttribute("Users", Users);
        return "client";
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String handleLogin(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            Model model) {

        model.addAttribute("username", username);
        model.addAttribute("password", password);

        return "welcome";
    }

}