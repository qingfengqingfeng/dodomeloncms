package com.dodostudio.dodomeloncms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.dodostudio.dodomeloncms.mapper")
public class DodomelonCmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DodomelonCmsApplication.class, args);
	}
}
