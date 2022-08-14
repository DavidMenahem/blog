package com.david.blog.controllers;

import com.david.blog.models.ImageEntity;
import com.david.blog.models.PostEntity;
import com.david.blog.services.CommentService;
import com.david.blog.services.ImageService;
import com.david.blog.services.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("/admin")
public class AdminController {
    private final PostService postService;
    private final CommentService commentService;
    private final ImageService imageService;

    @PostMapping(value = "/image", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    @ResponseStatus(HttpStatus.CREATED)
    private final ImageEntity create(@RequestParam MultipartFile image,
                                     @RequestParam("postId") long postId) throws IOException {
        ImageEntity imageEntity = new ImageEntity();
        imageEntity.setPostId(postId);
        imageEntity.setImageBlob(image.getBytes());
        return imageService.create(imageEntity);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/post")
    public PostEntity create(@RequestBody PostEntity postEntity) {
        return postService.create(postEntity);
    }

    @PutMapping("/post")
    public PostEntity update(@RequestBody PostEntity postEntity) {
        return postService.create(postEntity);
    }

    @DeleteMapping("/post/{id}")
    public void deletePost(@PathVariable long id) {
        postService.delete(id);
    }

    @DeleteMapping("/comment/{cId}")
    public void deleteComment(@PathVariable long cId) {
        commentService.delete(cId);

    }
}
