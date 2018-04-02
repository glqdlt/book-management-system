package com.glqdlt.bmscommon;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created By iw.jhun
 * On 2018-03-30 , 오후 2:09
 */
@SpringBootApplication
public class CommonApplication{
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(CommonApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
    }
}