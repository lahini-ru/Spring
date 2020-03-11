package com.test.demoapp.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    //@RequestMapping(value="/ //this will support to any type of request
    @RequestMapping(value="/hello", method= RequestMethod.GET) //this wil only support to get requests
    public String greeting(){
        return "Hello Springboot"; //controller handle the traffic
    }

    @RequestMapping(value="/hello", method= RequestMethod.POST) //this wil only support to post requests
    public String greeting2(){
        return "Hello Springboot from POST"; //controller handle the traffic
    }
}
