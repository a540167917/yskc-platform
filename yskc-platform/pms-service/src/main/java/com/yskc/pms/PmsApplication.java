package com.yskc.pms;

import com.alibaba.dubbo.container.Main;
import lombok.extern.log4j.Log4j2;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *菜单服务启动类
 */
@Log4j2
@MapperScan(basePackages = "com.yskc.pms.mapper")
@ImportResource(locations = {"/dubbo-provider.xml"})
@EnableTransactionManagement
@SpringBootApplication
public class PmsApplication {
    public static void main( String[] args ) {
        SpringApplication.run(PmsApplication.class, args); 
        Main.main(args);
    }
}