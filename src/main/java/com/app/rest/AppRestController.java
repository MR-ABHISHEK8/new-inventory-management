package com.app.rest;


import com.app.entiry.UserEntity;
import com.app.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/rest")
public class AppRestController {

    @Autowired
    AppService appService;


    @PostMapping("/saveUserData")
    public void saveUserData(@RequestParam Map<String, Object> map){
        appService.saveUserData(map);
    }
    @GetMapping("/getUsers")
    public List<UserEntity> getUsers(){
        return appService.getUsers();
    }
}
