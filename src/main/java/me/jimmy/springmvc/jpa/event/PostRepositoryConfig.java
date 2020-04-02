package me.jimmy.springmvc.jpa.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PostRepositoryConfig {
    @Bean
    public ApplicationListener<PostPublishedEvent> postListener() {
        return event -> {
            System.out.println("------------------------");
            System.out.println(event.getPost().getTitle() + " is publishedEvenet");
            System.out.println("------------------------");
        };
    }
}
