package com.ysc.apps.online.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.ysc.apps.online.dao")
public class MybatisConfig {

}
