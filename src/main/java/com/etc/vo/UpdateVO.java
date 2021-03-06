package com.etc.vo;

import com.etc.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateVO {
    private Integer hId;
    private String title;

    private Double floorage;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date houseDate;
    private String districtId;
    private String streetId;
    private MultipartFile hImg;
    private User user;
}
