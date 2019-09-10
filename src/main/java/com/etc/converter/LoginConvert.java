package com.etc.converter;

import com.etc.entity.User;
import com.etc.vo.LoginVO;
import com.etc.vo.UserVO;

public class LoginConvert {
    public static User converter(LoginVO loginVO){
        User user=new User();
        user.setUserId(loginVO.getUserId());
       user.setUserName(loginVO.getName());
       user.setUserPass(loginVO.getPassword());
        return user;
    }

}
