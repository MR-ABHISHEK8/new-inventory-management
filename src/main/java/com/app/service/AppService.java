package com.app.service;

import com.app.entiry.UserEntity;

import java.util.List;
import java.util.Map;

public interface AppService {
    void saveUserData(Map<String,Object> patram);
    List<UserEntity>getUsers();
}
