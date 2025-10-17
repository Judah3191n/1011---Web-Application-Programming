package com.example.registration;

import io.micrometer.common.lang.NonNull;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class FeedbackForm {
    @NotBlank
    @Size(max = 100, message = "Subject must be less the 100 characters")
    private String subject;

    @NotBlank
    @Size(min = 20, max = 500, message = "Message must be between 20 and 500 characters")
    private String message;

    @NotNull
    private Integer rating;

    // getters and setters
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
