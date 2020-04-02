package me.jimmy.springmvc.jpa.customRepo;

import me.jimmy.springmvc.jpa.event.Post;

import java.util.List;

public interface PostCustomRepository<T> {

    List<Post> findMyPost();

    void delete(T entity);
}
