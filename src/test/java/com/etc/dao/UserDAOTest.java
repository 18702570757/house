package com.etc.dao;

import com.etc.BaseTest;
import com.etc.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDAOTest extends BaseTest {
    @Autowired
    private UserDAO userDAO;
    @Test
    public void testReg(){
        User user=new User("哈哈","b","c","d");
        userDAO.reg(user);

    }
    @Test
    public void testLogin(){

        User user1=userDAO.login("aaaaaa","1");
        System.out.println(user1);

    }
}
