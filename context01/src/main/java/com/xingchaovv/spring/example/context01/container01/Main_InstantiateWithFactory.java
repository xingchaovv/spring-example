package com.xingchaovv.spring.example.context01.container01;

import com.xingchaovv.spring.example.context01.container01.dao.LegacyOrderDao;
import com.xingchaovv.spring.example.context01.container01.service.PetStoreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class Main_InstantiateWithFactory {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "container01/context.xml"
        );

        LegacyOrderDao legacyOrderDao = context.getBean("legacyOrderDao", LegacyOrderDao.class);
        log.info("legacyOrderDao: {}", legacyOrderDao);
    }
}
