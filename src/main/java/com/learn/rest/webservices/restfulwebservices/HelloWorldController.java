package com.learn.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController
{
   //@RequestMapping(method = RequestMethod.GET,path = "/hello-world")
    @GetMapping("/hello-world")
    public String helloWorld()
   {
       return "Welcome to Controller";
   }

   @GetMapping("/hello-world-bean")
    public HelloWorldBean helloWorldBean()
   {
       return new HelloWorldBean("Hello !!!");
   }
}
