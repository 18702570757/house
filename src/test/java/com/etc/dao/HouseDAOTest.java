package com.etc.dao;

import com.etc.BaseTest;
import com.etc.entity.House;
import com.etc.entity.User;
import com.etc.vo.HouseSearchVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public class HouseDAOTest extends BaseTest {
@Autowired
    private HouseDAO houseDAO;
@Test
    public void testFabu(){
    User user=new User();
    user.setUserId(1);
    House house=new House(null,"a",80.0,new Date(),"b","c","d:/images/i.jpg",user);
    houseDAO.fabu(house);

}
@Test
    public void testSearch(){
    HouseSearchVO searchVO=new HouseSearchVO();
    //searchVO.setName("1");

    PageHelper.startPage(1,2);
    List<House> list=houseDAO.search(searchVO);
    PageInfo<House> pageInfo=new PageInfo<>(list);
    System.out.println(pageInfo);
    System.out.println(pageInfo.getTotal());
    System.out.println(pageInfo.getPages());

    for(House house1:list){
        System.out.println(house1);
    }



}
/*public void testupdate(){
    House house=new House();
    house.setHDate("2019-12-12");

}*/
}
