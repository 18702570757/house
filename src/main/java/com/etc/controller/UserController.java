package com.etc.controller;

import com.etc.converter.LoginConvert;
import com.etc.converter.UserConverter;
import com.etc.entity.User;
import com.etc.service.UserService;
import com.etc.vo.LoginVO;
import com.etc.vo.ResultVO;
import com.etc.vo.UserVO;
import com.etc.vo.ValidVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
@SessionAttributes("userlog")
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/reg")
    public String reg() {
        return "regs";
    }
    @RequestMapping("valid")
    @ResponseBody
    public ResultVO valid(@RequestBody ValidVO validVO){
        if("admin".equals(validVO.getName())){
            return new ResultVO(false);
        }
        return new ResultVO(true);
    }


    @RequestMapping("doreg")
    public String doreg(@ModelAttribute("userVO") @Valid UserVO userVO, BindingResult bindingResult) {
        System.out.println(userVO);
        if (bindingResult.hasErrors()) {
            return "regs";
        }

        User user = UserConverter.converter(userVO);
        userService.reg(user);

        return "redirect:login";
    }

    @RequestMapping("login")
    public String login() {
        return "login";
    }

    @RequestMapping("dologin")
    public String dologin(String name,String password,HttpSession session) {

        User user =userService.login(name,password);
        System.out.println(user);
        session.setAttribute("user",user);

        if(user==null){
            System.out.println("fail");
            return "login";
        }
        return "redirect:/house/guanli";
    }
    @RequestMapping("outlogin")
    public String outLogin(HttpSession session){
        session.invalidate();
        return "login";

    }
}
