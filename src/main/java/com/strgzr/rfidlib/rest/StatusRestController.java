package com.strgzr.rfidlib.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusRestController {
    @GetMapping("/status")
    @ResponseBody
    public String status() {
        return "OK";
    }
}
