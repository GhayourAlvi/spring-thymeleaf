package com.sibau.ead.springthymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class UsersController {
    @GetMapping("/users")
    public String users(Model model){
        model.addAttribute("users", Arrays.asList(new User("Mr", "Ghayour", "Alvi")));
        return "users";
    }
class User{
    String title;
    String first;
    String last;
    public User(){
    }
    public User(String title,  String first, String last){
        this.title=title;
        this.first=first;
        this.last=last;
    }
    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public String getTitle() {
        return title;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}}
