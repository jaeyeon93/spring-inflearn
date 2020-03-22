package me.jimmy.springmvc.ioc;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MyEventHandler {

    @EventListener
    @Async
    @Order(Ordered.HIGHEST_PRECEDENCE)
    public void handle(MyEvenet myEvenet) {
        System.out.println(Thread.currentThread().toString());
        System.out.println("이벤트 받았다. 데이터는 : " + myEvenet.getData());
    }

    @EventListener
    @Async
    public void handle(ContextRefreshedEvent event) {
        System.out.println(Thread.currentThread().toString());
        System.out.println("컨텍스트 리프레시 이벤트 발생 ConxtextRefreshedEvent");
        System.out.println(event.toString());
    }

    @EventListener
    @Async
    public void handle(ContextStartedEvent event) {
        System.out.println(Thread.currentThread().toString());
        System.out.println("컨텍스트 시작 이벤트 ConxtextStartEvent");
        System.out.println(event.toString());
    }

    @EventListener
    @Async
    public void handle(ContextClosedEvent event) {
        System.out.println(Thread.currentThread().toString());
        System.out.println("컨텍스트 종료 이벤트 ConxtextClosedEvent");
        System.out.println(event.toString());
    }
}
