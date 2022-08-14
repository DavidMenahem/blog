package com.david.blog.controllers;

import com.david.blog.models.CommentEntity;
import com.david.blog.services.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("/comment")
@RestController
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;

    @GetMapping("{id}")
    public List<CommentEntity> getPostComments(@PathVariable long id){
        return commentService.getPostComments(id);
    }

    @PostMapping
    public CommentEntity add(@RequestBody CommentEntity commentEntity){
        return commentService.create(commentEntity);
    }
}
