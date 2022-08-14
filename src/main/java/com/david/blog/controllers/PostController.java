package com.david.blog.controllers;
import com.david.blog.models.PostEntity;
import com.david.blog.services.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("posts")
@RestController
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @GetMapping
    public List<PostEntity> getALl(){
        return postService.getAll();
    }
}
