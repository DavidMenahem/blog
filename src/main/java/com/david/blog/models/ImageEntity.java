package com.david.blog.models;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
@Table(name = "images")
public class ImageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private long postId;

    @Lob
    private byte[] image;

    @Lob
    private byte[] imageBlob;
}
