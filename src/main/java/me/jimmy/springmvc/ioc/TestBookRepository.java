package me.jimmy.springmvc.ioc;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("test")
public class TestBookRepository implements BookRepository {
}
