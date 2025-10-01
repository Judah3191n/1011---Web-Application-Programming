package com.travel.clients;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer;

// browser cookie: store data on browser
// session: store data on server

@Controller
@SessionAttributes({ "username", "counter" })
public class HelloController {
    public ArrayList<User> users = new ArrayList<User>();

    // clients
    @GetMapping("/client")
    public String getHello(Model model) {

        users.add(new User("Judah", "P@ssword1"));
        users.add(new User("Jeremy", "ASecret"));
        users.add(new User("Nadia", "Uncrackable"));
        users.add(new User("David", "help"));
        users.add(new User("Jalen", "yellow submarine"));

        model.addAttribute("msg", "List of the Clients");
        model.addAttribute("date", LocalDate.now());
        model.addAttribute("Users", users);

        return "client";
    }

    // login
    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String handleLogin(@RequestParam String username, @RequestParam String password, Model model) {
        users.add(new User("David", "help"));
        model.addAttribute("username", username);
        model.addAttribute("counter", 0);
        for (User user : users) {
            if (user.getName().equals(username) && user.getPassword().equals(password)) {
                return "welcome";
            }
        }
        return "login";
    }

    // welcome button
    @PostMapping("/click")
    public String countClick(@SessionAttribute("counter") Integer counter, Model model) {
        counter++;
        model.addAttribute("counter", counter);
        return "welcome";
    }

    // register user
    @GetMapping("/register")
    public String showRegisterForm() {
        return "register";
    }

    @PostMapping("/register")
    public String postMethodName(@RequestParam String username, @RequestParam String password, Model model) {
        for (User user : users) {
            if (user.getName().equals(username)) {
                model.addAttribute("usernameError", "Username already taken");
                return "register";
            }
        }
        users.add(new User(username, password));
        return "login";

    }

    // test
    @GetMapping("/test")
    public String testt(@ModelAttribute("username") String user, Model model) { // part2
        model.addAttribute("tt", user); // part3 , part4 to be in the test.html
        return "test";
    }

}