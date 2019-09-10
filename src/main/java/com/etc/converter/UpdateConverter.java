package com.etc.converter;

import com.etc.entity.House;
import com.etc.entity.User;
import com.etc.vo.UpdateVO;

public class UpdateConverter {
    public static House conver(UpdateVO updateVO){
        House house=new House();
        house.setHId(updateVO.getHId());
        house.setHName(updateVO.getTitle());
        house.setHDate(updateVO.getHouseDate());
        house.setHRect(updateVO.getFloorage());
        house.setHLoc1(updateVO.getDistrictId());
        house.setHLoc2(updateVO.getStreetId());

        return house;

    }



}
