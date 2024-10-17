package com.app.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/api")
public class AppMvcController {

    @GetMapping("/index")
    public String index(){
        System.out.println("Index printing...");
        return "index";
    }

}
