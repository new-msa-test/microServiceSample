package com.msatest.service1.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service-1")
@Slf4j
public class TestController {

    @GetMapping("/test")
    public String test(@RequestHeader("service1-reqHeader-key") String header) {
        log.info("header : {}", header);
        return "Service 1 is working";
    }

    @GetMapping("/port")
    public String getPort(HttpServletRequest request) {
        return "Service 1 is running on port: " + request.getServerPort();
    }

}
