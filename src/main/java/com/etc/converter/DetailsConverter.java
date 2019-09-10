package com.etc.converter;

import com.etc.entity.House;
import com.etc.vo.DetailsVO;


public class DetailsConverter {
    public static House conver(DetailsVO detailsVO){
        House house=new House();
        house.setHName(detailsVO.getTitle());
        house.setHRect(detailsVO.getFloorage());
        house.setHLoc1(detailsVO.getDistrictId());
        house.setHLoc2(detailsVO.getStreetId());
        return house;
    }

}
