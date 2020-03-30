package me.jimmy.springmvc.jpa;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.stream.Stream;

public interface CommentRepository extends MyRepository<Comment, Long> {

    List<Comment> findByCommentContains(String keyword);

    List<Comment> findByCommentContainsIgnoreCaseOrderByLikeCount(String keyword);

    Page<Comment> findByCommentContainsIgnoreCase(String keyword, Pageable pageable);

    Page<Comment> findByLikeCountGreaterThanAndPost(int likecount, Post post, Pageable pageable);
}
