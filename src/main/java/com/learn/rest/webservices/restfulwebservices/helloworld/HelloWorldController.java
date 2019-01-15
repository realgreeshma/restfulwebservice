package com.learn.rest.webservices.restfulwebservices.helloworld;

import com.learn.rest.webservices.restfulwebservices.helloworld.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController
{
   //@RequestMapping(method = RequestMethod.GET,path = "/hello-world")
    @GetMapping("/hello-world")
    public String helloWorld()
   {
       return "Welcome to Controller";
   }
//mapping a bean class
   @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean()
   {
       return new HelloWorldBean("Hello !!!");
   }

   //mapping through path variables
    @GetMapping(path = "/helloworldbean/path-variable/{name}")
    public HelloWorldBean helloWorldBeanPathVariable(@PathVariable String name)
    {
        return new HelloWorldBean(String.format("Hello !!!,%s",name));
    }
}
