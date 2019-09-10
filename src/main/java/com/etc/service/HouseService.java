package com.etc.service;

import com.etc.dao.HouseDAO;
import com.etc.entity.House;
import com.etc.entity.User;
import com.etc.vo.HouseSearchVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseService {
    @Autowired
    private HouseDAO houseDAO;
    public void fabu(House house){
        System.out.println(houseDAO);
        houseDAO.fabu(house);

    }
    public List<House> search(HouseSearchVO houseSearchVO){
         return houseDAO.search(houseSearchVO);
    }
    public void delete(int hId){
        houseDAO.delete(hId);
    }
    public void update(House house){
        houseDAO.update(house);
    }
    public House select(int hId){
       return houseDAO.select(hId);
    }
    public List<House> guanli(int userId){
        return houseDAO.guanli(userId);
    }


}
