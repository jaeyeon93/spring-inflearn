package me.jimmy.springmvc;

import org.apache.naming.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableAsync;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) throws SQLException {
		SpringApplication.run(DemoApplication.class, args);
		String url = "jdbc:postgresql://localhost:54320/jpa-test";
		String username = "id";
		String password="test";
		try (Connection connection = DriverManager.getConnection(url, username, password)){
			System.out.println("Connection created: " + connection);
			String sql = "insert into ACCOUNT values (1, 'docker', '123')";
			try(PreparedStatement statement = connection.prepareStatement(sql)) {
				statement.execute();
			}
		}
	}
}
