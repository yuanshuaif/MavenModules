package springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;

/**
 * Created by 10326 on 2020/1/31.
 */
@RestController
public class HelloController {
    @Autowired
    UserService userService;
    @GetMapping("/hello")
    public String index(){
        return userService.hello();
    }
    @GetMapping("hello1")
    public String index1(){
        return "nihao";
    }
}
