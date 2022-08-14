package com.david.blog.repositories;

import com.david.blog.models.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<CommentEntity,Long> {
    void deleteByPostId(long id);

    @Query(value = "SELECT * FROM comments WHERE post_id = ?",nativeQuery = true)
    List<CommentEntity> getPostComments(long id);
}
