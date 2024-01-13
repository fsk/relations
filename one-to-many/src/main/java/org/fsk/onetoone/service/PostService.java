package org.fsk.onetoone.service;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.fsk.onetoone.entity.Post;
import org.fsk.onetoone.entity.PostComment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {

    private final EntityManager entityManager;

    private final Logger logger = LoggerFactory.getLogger(PostService.class);


    @Transactional
    public void loadDataToDb() {
        Post post1 = new Post("Spring Boot and MondoDB");

        post1.getComments().add(
                new PostComment("This article was brilliant")
        );

        post1.getComments().add(
                new PostComment("Good article")
        );

        post1.getComments().add(
                new PostComment("Not enough")
        );

        entityManager.persist(post1);

        logger.info("##-- Veriler basariyla yuklendi. --##");
    }

}
