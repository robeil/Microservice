package com.robeil.restfullwebapi.helloWorld.controller;

import com.robeil.restfullwebapi.helloWorld.entity.HelloWorldBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired
    private MessageSource messageSource;

    @GetMapping
    public String getHelloWorld(){
        return "Hello World from Robeil Aregawi.";
    }

    @GetMapping("/bean")
    public HelloWorldBean getHelloWorldBean(){
        return new HelloWorldBean("Hello World from HelloWorldBean.");
    }

    @GetMapping("/{name}")
    public HelloWorldBean getHelloWorld(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello , %s", name));
    }
    @GetMapping("/internationalized")
    public String HelloWorldInternationalized() {
        Locale locale = LocaleContextHolder.getLocale();
        return  messageSource.getMessage("good.morning.message",null,"Default Message",locale);
    }
}
