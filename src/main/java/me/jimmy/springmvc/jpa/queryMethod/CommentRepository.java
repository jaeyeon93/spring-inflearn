package me.jimmy.springmvc.jpa.queryMethod;

import me.jimmy.springmvc.jpa.event.Post;
import me.jimmy.springmvc.jpa.customRepo.MyRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CommentRepository extends MyRepository<Comment, Long> {

    List<Comment> findByCommentContains(String keyword);

    List<Comment> findByCommentContainsIgnoreCaseOrderByLikeCount(String keyword);

    Page<Comment> findByCommentContainsIgnoreCase(String keyword, Pageable pageable);

    Page<Comment> findByLikeCountGreaterThanAndPost(int likecount, Post post, Pageable pageable);
}
