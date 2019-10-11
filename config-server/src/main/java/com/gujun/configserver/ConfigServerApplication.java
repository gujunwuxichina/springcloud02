package com.gujun.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer //开启配置服务器
public class ConfigServerApplication {

    /*
        在分布式系统中，由于服务数量巨多，为了方便服务配置文件统一管理，实时更新，所以需要分布式配置中心组件；
        spring cloud中有有分布式配置中心组件spring cloud config,它支持配置服务放在配置服务的内存中(即本地)，
        也支持放在远程Git仓库中；在spring cloud config组件中，有两个角色：config server和config client;
     */

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }

}
