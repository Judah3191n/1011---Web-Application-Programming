package com.example.registration;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    // form
    @GetMapping("/form")
    public String showForm(Model model) {

        model.addAttribute("userForm", new UserForm());
        return "form";
    }

    @PostMapping("/form")
    public String submitForm(@Valid @ModelAttribute UserForm form, BindingResult result) {
        if (result.hasErrors()) {
            return "form";
        }

        return "success";
    }

    // feedback
    @GetMapping("/feedback")
    public String showFeedbackForm(Model model) {
        model.addAttribute("feedbackForm", new FeedbackForm());
        return "feedback";
    }

    @PostMapping("/feedback")
    public String feedbackForm(@Valid @ModelAttribute FeedbackForm form, BindingResult result) {
        if (result.hasErrors()) {
            return "feedback";
        }

        return "success";
    }

}
