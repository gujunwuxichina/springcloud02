package com.gujun.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }

    @Value("${name}")
    private String name;

    //config-client从config-server获取了foo的属性，而config-server是从git仓库读取的;
    //如果本地配置文件中也配置了远程中相同的配置，则远程覆盖本地
    @GetMapping("/name")
    public String name(){
        return name;
    }

}
