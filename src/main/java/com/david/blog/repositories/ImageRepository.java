package com.david.blog.repositories;

import com.david.blog.models.ImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImageRepository extends JpaRepository<ImageEntity,Long> {
    void deleteByPostId(long id);
    @Query(value = "SELECT * FROM images WHERE post_id =?",nativeQuery = true)
    List<ImageEntity> getPostImages(long postId);
}
