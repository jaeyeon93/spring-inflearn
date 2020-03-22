package me.jimmy.springmvc.aop;

import org.springframework.stereotype.Service;

@Service
public class SimpleEventService implements EvenetService {

    @PerLogging
    @Override
    public void createEvent() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("create an event");
    }

    @PerLogging
    @Override
    public void publishEvent() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("published an event");
    }

    @Override
    public void deleteEvent() {
        System.out.println("deleted an event");
    }
}
