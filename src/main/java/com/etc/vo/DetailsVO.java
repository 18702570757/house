package com.etc.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetailsVO {
    private String title;

    private Double floorage;

    private String districtId;
    private String streetId;
}
