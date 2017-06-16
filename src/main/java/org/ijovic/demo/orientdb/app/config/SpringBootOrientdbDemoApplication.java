package org.ijovic.demo.orientdb.app.config;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.boot.autoconfigure.web.ResourceProperties;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.boot.autoconfigure.web.WebMvcProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.orient.commons.repository.config.EnableOrientRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@EnableTransactionManagement
@ComponentScan("org.ijovic.demo")
@EnableOrientRepositories("org.ijovic.demo.orientdb.repository")
public class SpringBootOrientdbDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOrientdbDemoApplication.class, args);
	}

}
