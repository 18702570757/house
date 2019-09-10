package com.etc.converter;

import com.etc.entity.House;
import com.etc.entity.User;
import com.etc.vo.HouseVO;

public class HouseConverter {
    public static House conver(HouseVO houseVO, String img, User user){
        House house=new House();
        house.setHName(houseVO.getTitle());
        house.setHDate(houseVO.getHouseDate());
        house.setHRect(houseVO.getFloorage());
       house.setHRect(houseVO.getFloorage());
       house.setHLoc1(houseVO.getDistrictId());
       house.setHLoc2(houseVO.getStreetId());
       house.setHImg(img);
       house.setUser(user);


       return house;


    }
}
