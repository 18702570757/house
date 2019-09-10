package com.etc.dao;

import com.etc.entity.House;
import com.etc.entity.User;
import com.etc.vo.HouseSearchVO;
import com.etc.vo.HouseVO;

import java.util.List;

public interface HouseDAO {
    void fabu(House house);
    List<House> search(HouseSearchVO searchVO);
    void delete(int hId);
    void update(House house);
    House select(int hId);
    List<House> guanli(int userId);



}
