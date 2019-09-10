package com.etc.controller;

import com.etc.common.Constant;
import com.etc.converter.DetailsConverter;
import com.etc.converter.HouseConverter;
import com.etc.converter.UpdateConverter;
import com.etc.entity.House;
import com.etc.entity.User;
import com.etc.service.HouseService;
import com.etc.vo.*;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/house")
public class HouseController {
    @RequestMapping("/images")
    public String images(String imgName, HttpServletResponse response) throws IOException {
        IOUtils.copy(new FileInputStream(UPLOAD_DIR+imgName),response.getOutputStream());
    return null;
    }

    public static final String UPLOAD_DIR="D:\\images\\";
    @Autowired
    private HouseService houseService;
    @RequestMapping("/fabu")
    public String fabu( HouseVO houseVO,HttpSession session) throws IOException {
        System.out.println(houseVO);

        houseVO.getHImg().transferTo(new File(UPLOAD_DIR+houseVO.getHImg().getOriginalFilename()));

        User user = (User) session.getAttribute("user");
        System.out.println(user.getUserId());
        House house=HouseConverter.conver(houseVO,houseVO.getHImg().getOriginalFilename(),user);
        houseService.fabu(house);
        return "redirect:/house/guanli";
    }
    @RequestMapping("search")
    public String search(@ModelAttribute("vo2") HouseSearchVO2 houseSearchVO2, Integer pageNum, Model model){
        if(pageNum==null){

            pageNum=1;
        }
        System.out.println(houseSearchVO2);
        HouseSearchVO houseSearchVO=new HouseSearchVO();
        houseSearchVO.setName(houseSearchVO2.getName());
       if(!StringUtils.isEmpty(houseSearchVO2.getFloorage())){
          String[] strs= houseSearchVO2.getFloorage().split("-");
            houseSearchVO.setMinRect(Double.valueOf(strs[0]));
           houseSearchVO.setMaxRect(Double.valueOf(strs[1]));
       }
        PageHelper.startPage(pageNum, Constant.PAGE_SIZE);

        List<House> list=houseService.search(houseSearchVO);
        PageInfo<House> pageInfo=new PageInfo<>(list);
        for(House house:list) {
            System.out.println(list);
        }
        System.out.println(pageInfo.getPages());
        model.addAttribute("pageInfo",pageInfo);

        return "list";

    }

    @RequestMapping("guanli")
    public String guanli( HouseSearchVO2 houseSearchVO2, Integer pageNum, Model model,HttpSession session) {
        if (pageNum == null) {
            pageNum = 1;
        }
        //System.out.println(houseSearchVO2);
        PageHelper.startPage(pageNum, Constant.PAGE_SIZE);
        User user=(User)session.getAttribute("user");

        System.out.println(user);

        List<House> list = houseService.guanli(user.getUserId());//search(houseSearchVO);
        PageInfo<House> pageInfo = new PageInfo<>(list);
        for (House house:list) {
            System.out.println(house);
        }
        // System.out.println(pageInfo.getPages());
        model.addAttribute("pageInfo", pageInfo);
        return "guanli";
    }
    @RequestMapping("/delete")
    public String delete(String hId){
        int id=Integer.valueOf(hId);
        System.out.println(id);
        houseService.delete(id);
        return "redirect:/house/search";

    }
    @RequestMapping("/update")
    public String update(@ModelAttribute("updateVO") UpdateVO updateVO,Model model){
        House house=new House();
        //int id=Integer.valueOf(hId);
        //System.out.println(id);
       House house1= houseService.select(Integer.valueOf(updateVO.getHId()));
        model.addAttribute("house",house1);
        System.out.println(house1);

        //model.addAttribute("id",hId);

        return "xiugai";

    }
    @RequestMapping("doupdate")
    public String doupdate(UpdateVO updateVO,Model model){
        House house= UpdateConverter.conver(updateVO);
        System.out.println(house.getHId());
        houseService.update(house);
       model.addAttribute("house",house);
//        System.out.println(house);
        return "redirect:guanli";

    }
    @RequestMapping("details")
    public String details(String hId,Model model){
        //House house= DetailsConverter.conver(detailsVO);
        //System.out.println(house);
        int id=Integer.valueOf(hId);
        House house=houseService.select(id);
        model.addAttribute("house",house);
        System.out.println(house);


        return "details";
    }





}
