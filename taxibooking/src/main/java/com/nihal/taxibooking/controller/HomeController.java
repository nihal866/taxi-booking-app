package com.nihal.taxibooking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(path = { "", "home", "index", "welcome" })
    public String welcomeView() {
        return "index";
    }

    @GetMapping("about")
    public String aboutView() {
        return "index-1";
    }

    @GetMapping("cars")
    public String carsView() {
        return "index-2";
    }

    @GetMapping("services")
    public String servicesView() {
        return "index-3";
    }

    @GetMapping("contacts")
    public String contactsView() {
        return "index-4";
    }
}
