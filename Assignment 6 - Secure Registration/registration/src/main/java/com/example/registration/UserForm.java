package com.example.registration;

import com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class UserForm {
    @NotBlank
    @Size(min = 2, message = "Name must be greate then 2 characters")
    @Pattern(regexp = "^[A-Za-z ]+$", message = "Name must only include uppercase and lowercase characters")
    private String fullName;

    @NotBlank
    @Email(message = "Email must be valid")
    private String email;

    @NotBlank
    @Size(min = 8, message = "Password must be greater the 8 characters")
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$", message = "Password must include lowercase uppercase and special character")
    private String password;

    @NotNull
    @Min(value = 18, message = "Age must be 18 or older")
    @Max(value = 120, message = "Age must be 120 or younger")
    private Integer age;

    @Size(max = 250, message = "Bio must be less then 250 characters")
    private String bio;

    // Getters and Setters
    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
