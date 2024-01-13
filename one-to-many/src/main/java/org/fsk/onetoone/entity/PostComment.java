package org.fsk.onetoone.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "PostComment")
@Table(name = "post_comment")
@Getter
@Setter
public class PostComment {

    @Id
    @GeneratedValue
    private Long id;

    private String review;

    public PostComment(String review) {
        this.review = review;
    }

    public PostComment() {

    }
}
