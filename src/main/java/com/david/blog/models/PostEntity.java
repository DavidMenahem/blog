package com.david.blog.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Table(name = "posts")
public class PostEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title;
    @Column(length = 5000)
    private String descriptionA;
    @Column(length = 5000)
    private String descriptionB;

    private int categoryId;

    @OneToMany(mappedBy = "postId")
    private List<CommentEntity> comments = new ArrayList();

    @OneToMany(mappedBy = "postId")
    private List<ImageEntity> images= new ArrayList();
}
