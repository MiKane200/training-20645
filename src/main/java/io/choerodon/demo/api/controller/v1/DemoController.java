package io.choerodon.demo.api.controller.v1;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoController {

    @Value("${name}")
    String name;
    
    @Value("${num}")
    String num;

    @GetMapping("/hello")
    public String hello() {
        return "hello," + num + "," + name;
    }
}
