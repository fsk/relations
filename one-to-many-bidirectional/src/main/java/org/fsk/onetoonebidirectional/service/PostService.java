package org.fsk.onetoonebidirectional.service;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.fsk.onetoonebidirectional.entity.Post;
import org.fsk.onetoonebidirectional.entity.PostComment;
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

        post1.addComment(new PostComment("This is a great article"));
        post1.addComment(new PostComment("Not Enough"));
        post1.addComment(new PostComment("Great.!!"));

        entityManager.persist(post1);

        logger.info("##-- Veriler basariyla yuklendi. --##");
    }

}
