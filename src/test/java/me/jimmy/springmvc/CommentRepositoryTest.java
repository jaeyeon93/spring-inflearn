package me.jimmy.springmvc;

import me.jimmy.springmvc.jpa.Comment;
import me.jimmy.springmvc.jpa.CommentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CommentRepositoryTest {

    @Autowired
    private CommentRepository commentRepository;

    @Test
    public void crudTest() {
        this.createComment(100, "spring data");
        this.createComment(50, "spring hello world");
        PageRequest pageRequest = PageRequest.of(0, 10, Sort.by(Sort.Direction.DESC, "LikeCount"));
        Page<Comment> all = commentRepository.findByCommentContainsIgnoreCase("spring", pageRequest);
        assertThat(all.getTotalElements()).isEqualTo(2);
    }

    private void createComment(int likeCount, String keyword) {
        Comment comment = new Comment();
        comment.setLikeCount(likeCount);
        comment.setComment(keyword);
        commentRepository.save(comment);
    }
}
