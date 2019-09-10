package com.etc.vo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
@NoArgsConstructor
@AllArgsConstructor
public class UserVO {
    @NotEmpty(message = "用户名不为空")
    @Length(min = 6,max = 10,message = "用户名长度在6-10位之间")
    private String name;
    private String password;
    private String repassword;
    private String telephone;
    private String username;



    @Override
    public String toString() {
        return "UserVO{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", repassword='" + repassword + '\'' +
                ", telephone='" + telephone + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepassword() {
        return repassword;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
