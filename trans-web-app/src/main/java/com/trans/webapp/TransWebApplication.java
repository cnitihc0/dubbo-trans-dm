package com.trans.webapp;

import com.trans.dm.service.api.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.env.SystemEnvironmentPropertySource;

/**
 * @author mashaobo
 * @date 17/2/23
 * @blog http://blog.csdn.net/cnitihc0
 * @email cnitihc0@163.com
 */
@SpringBootApplication
@ImportResource("classpath:application-*.xml")
@ServletComponentScan(value = {"com.trans.webapp.filter"})
public class TransWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(TransWebApplication.class, args);
    }
}