package me.jimmy.springmvc;

import org.springframework.context.event.EventListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class AnotherHandler {

    @EventListener
    @Order(Ordered.LOWEST_PRECEDENCE + 100)
    public void handle(MyEvenet myEvenet) {
        System.out.println(Thread.currentThread().toString());
        System.out.println("Another Handler : " + myEvenet.getData());
    }
}