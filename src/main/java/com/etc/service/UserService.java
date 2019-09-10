package com.etc.service;

import com.etc.dao.UserDAO;
import com.etc.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDAO userDAO;
    public void reg(User user){
        userDAO.reg(user);
    }
    public User login(String name,String password){

        return userDAO.login(name,password);


    }





}
