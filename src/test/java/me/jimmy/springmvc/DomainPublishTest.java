package me.jimmy.springmvc;

import me.jimmy.springmvc.jpa.event.Post;
import me.jimmy.springmvc.jpa.event.PostPublishedEvent;
import me.jimmy.springmvc.jpa.event.PostRepositoryConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
//@DataJpaTest
//@Import(PostRepositoryConfig.class)
//public class DomainPublishTest {
//    @Autowired
//    ApplicationContext applicationContext;
//
//    @Autowired
//    private PostRepository postRepository;
//
//    @Test
//    public void event() {
//        Post post = new Post();
//        post.setTitle("event");
//        PostPublishedEvent event = new PostPublishedEvent(post);
//
//        applicationContext.publishEvent(event);
//    }
//
//    @Test
//    public void 이벤트발생자동() {
//        Post post = new Post();
//        post.setTitle("이벤트자동발생");
//        postRepository.save(post.publish());
//    }
//}
