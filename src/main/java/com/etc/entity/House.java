package com.etc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class House {
    private Integer hId;
    private String hName;
    private Double hRect;

    private Date hDate;
    private String hLoc1;
    private String hLoc2;
    private String hImg;
    private User user;


}
