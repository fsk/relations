package org.fsk.onetoone;

import jakarta.transaction.Transactional;
import org.fsk.onetoone.service.PostService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Transactional
class OneToOneApplicationTests {

    @Autowired
    private PostService postService;

    @Test
    void contextLoads() {

        postService.loadDataToDb();
    }

}
