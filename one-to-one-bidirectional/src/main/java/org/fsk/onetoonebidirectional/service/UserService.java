package org.fsk.onetoonebidirectional.service;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.fsk.onetoonebidirectional.entity.Address;
import org.fsk.onetoonebidirectional.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final EntityManager entityManager;

    private final Logger logger = LoggerFactory.getLogger(UserService.class);


    @Transactional
    public void loadDataToDb() {
        User user1 = new User("Furkan Sahin Kulaksiz");

        user1.setAddressDetail(new Address("Ankara","Turkiye"));

        entityManager.persist(user1);


        logger.info("##-- Veriler basariyla yuklendi. --##");
    }

}
