package org.fsk.onetoone.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "Post")
@Table(name = "post")
@Getter
@Setter
public class Post {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PostComment> comments = new ArrayList<>();

    public Post(String title) {
        this.title = title;
    }

    public Post() {

    }
}
