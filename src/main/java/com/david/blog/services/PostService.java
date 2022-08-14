package com.david.blog.services;

import com.david.blog.models.CommentEntity;
import com.david.blog.models.PostEntity;
import com.david.blog.repositories.CommentRepository;
import com.david.blog.repositories.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;
@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;
    private final CommentService commentService;

    private final ImageService imageService;


    public PostEntity create(PostEntity post) {
        return postRepository.save(post);
    }
    @Transactional
    public void delete(long id){
        imageService.deleteByPostId(id);
        commentService.deleteByPostId(id);
        postRepository.deleteById(id);
    }

    public List<PostEntity> getAll(){
        List<PostEntity> posts =  postRepository.findAll();
        for (int i = 0; i<posts.size(); i++){
            posts.get(i).setComments(commentService.getPostComments(posts.get(i).getId()));
            posts.get(i).setImages(imageService.getPostImages(posts.get(i).getId()));
        }

        return posts;
    }
}
