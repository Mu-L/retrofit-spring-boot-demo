package com.example.retrofit.openservice.domain.requestEntity;

import lombok.Data;

/**
 * @author wangyuxi
 * @date 2020/08/24
 **/
@Data
public class LivedWeatherEntity {

    private String version;
    private String cityId;
    private String city;
    private String ip;
    private String callback;

    /**
     *  如果您使用的是react、vue、angular请填写值: 1
     */
    private String vue = "1";
}