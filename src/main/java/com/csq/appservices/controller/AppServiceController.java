package com.csq.appservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class AppServiceController {

    @GetMapping("/info")
    public String getServiceInfo() {
        return "App Services Information";
    }

}
