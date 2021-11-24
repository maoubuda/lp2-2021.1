package br.edu.ifce.lp2.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/tests")
@RestController
public class TestController {

    @GetMapping
    public String get() {
        return "Hello OK";
    }
}
