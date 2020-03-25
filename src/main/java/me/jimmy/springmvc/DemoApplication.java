package me.jimmy.springmvc;

import me.jimmy.springmvc.jpa.JimmyRegister;
import org.apache.naming.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.sql.SQLException;

@SpringBootApplication
@EnableJpaRepositories
@Import({JimmyRegister.class})
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(DemoApplication.class);
		app.setWebApplicationType(WebApplicationType.NONE);
		app.run(args);
//		SpringApplication.run(DemoApplication.class, args);
	}
}
