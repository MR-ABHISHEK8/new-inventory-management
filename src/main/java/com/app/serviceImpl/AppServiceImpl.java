package com.app.serviceImpl;

import com.app.entiry.UserEntity;
import com.app.repo.UserRepo;
import com.app.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AppServiceImpl implements AppService {

    @Autowired
    UserRepo userRepo;

    public void saveUserData(Map<String,Object> patram){
        String name=String.valueOf(patram.get("name"));
        String phoneno=String.valueOf(patram.get("phoneno"));
        String email=String.valueOf(patram.get("email"));

        UserEntity entity=new UserEntity();
        entity.setName(name);
        entity.setPhone(phoneno);
        entity.setEmail(email);
        userRepo.save(entity);
        System.out.println(entity.getId());
    }

    public List<UserEntity>getUsers(){
        return userRepo.findAll();
    }
}
