package me.jimmy.springmvc.jpa.customRepo;

import me.jimmy.springmvc.jpa.event.Post;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.util.List;

public class PostCustomRepositoryImpl implements PostCustomRepository {
    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Post> findMyPost() {
        System.out.println("custom findMyPost");
        return entityManager.createQuery("SELECT p from Post AS p", Post.class)
                .getResultList();
    }

    @Override
    public void delete(Object entity) {
        System.out.println("custom delete");
        entityManager.remove(entity);
    }
}
