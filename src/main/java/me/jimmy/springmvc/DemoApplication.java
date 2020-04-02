package me.jimmy.springmvc;

import me.jimmy.springmvc.jpa.beanScan.JimmyRegister;
import me.jimmy.springmvc.jpa.customRepo.CommonRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(repositoryBaseClass = CommonRepositoryImpl.class)
@Import({JimmyRegister.class})
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(DemoApplication.class);
		app.setWebApplicationType(WebApplicationType.NONE);
		app.run(args);
//		SpringApplication.run(DemoApplication.class, args);
	}
}
