package com.logindemo.demologinpage;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EnableAutoConfiguration
//@EnableJpaRepositories(basePackages = "com.logindemo.demologinpage.repository")
//@ComponentScan(basePackages = "com.logindemo.demologinpage")
@SpringBootApplication
@EntityScan(basePackages = "com.logindemo.demologinpage.entity")
public class DemologinpageApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(DemologinpageApplication.class, args);
	}

}
