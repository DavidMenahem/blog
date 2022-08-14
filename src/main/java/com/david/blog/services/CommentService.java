package com.david.blog.services;

import com.david.blog.models.CommentEntity;
import com.david.blog.repositories.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;

    public CommentEntity create(CommentEntity commentEntity){
        return commentRepository.save(commentEntity);
    }

    public void delete(long id){
        commentRepository.deleteById(id);
    }

    public void deleteByPostId(long id){
        commentRepository.deleteByPostId(id);
    }

    public CommentEntity get(long id){
        return commentRepository.findById(id).orElse(null);
    }

    public List<CommentEntity> getAll(){
        return commentRepository.findAll();
    }

    public List<CommentEntity> getPostComments(long id){
        return commentRepository.getPostComments(id);
    }
}
