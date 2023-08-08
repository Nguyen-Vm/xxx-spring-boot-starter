package org.example;

import org.example.service.XxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private XxxService xxxService;

    @RequestMapping("/")
    String hello() {
        return xxxService.getName();
    }

}
