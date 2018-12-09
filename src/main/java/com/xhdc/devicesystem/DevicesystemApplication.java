package com.xhdc.devicesystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.WebApplicationInitializer;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@MapperScan(value = "com.xhdc.devicesystem.dao")
public class DevicesystemApplication extends SpringBootServletInitializer implements WebApplicationInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DevicesystemApplication.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(DevicesystemApplication.class, args);
    }
}
