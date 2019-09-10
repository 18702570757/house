package com.etc.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HouseSearchVO {


    private String name;
    private Double minRect;
    private Double maxRect;
}
