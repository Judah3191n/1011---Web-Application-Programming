package com.travel.clients;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class HelloController {

    @GetMapping("/client")
    public String getHello(Model model) {
        ArrayList<String> clients = new ArrayList<String>();
        clients.add("Nadia");
        clients.add("Esraa");
        clients.add("Josh");
        clients.add("Jeremy");
        clients.add("Judah the Best");

        ArrayList<User> Users = new ArrayList<User>();
        Users.add(new User("Judah", "P@ssword1"));
        Users.add(new User("Jeremy", "ASecret"));
        Users.add(new User("Nadia", "Uncrackable"));
        Users.add(new User("David", "help"));
        Users.add(new User("Jalen", "yellow submarine"));

        model.addAttribute("msg", "List of the Clients");
        model.addAttribute("date", LocalDate.now());
        model.addAttribute("clientsData", clients);
        model.addAttribute("Users", Users);
        return "client";
    }

}