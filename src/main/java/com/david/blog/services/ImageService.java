package com.david.blog.services;

import com.david.blog.models.ImageEntity;
import com.david.blog.repositories.ImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ImageService {

    private final ImageRepository imageRepository;
    public ImageEntity create(ImageEntity imageEntity){
        return imageRepository.save(imageEntity);
    }

    public List<ImageEntity> getPostImages(long postId){
        return imageRepository.getPostImages(postId);
    }

    public void deleteByPostId(long postId){
        imageRepository.deleteByPostId(postId);
    }
}
