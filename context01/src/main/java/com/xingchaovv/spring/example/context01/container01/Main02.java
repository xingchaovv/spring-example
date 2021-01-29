package com.xingchaovv.spring.example.context01.container01;

import com.xingchaovv.spring.example.context01.container01.service.PetStoreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class Main02 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "container01/context.xml"
        );

        PetStoreService petStoreService = context.getBean("petStoreService", PetStoreService.class);
        log.info("petStoreService: {}", petStoreService);

        PetStoreService petStoreSv1 = context.getBean("petStoreSv1", PetStoreService.class);
        log.info("petStoreSv1: {}", petStoreSv1);

        PetStoreService petStoreSv2 = context.getBean("petStoreSv2", PetStoreService.class);
        log.info("petStoreSv2: {}", petStoreSv2);

        PetStoreService petStoreSv3 = context.getBean("petStoreSv3", PetStoreService.class);
        log.info("petStoreSv3: {}", petStoreSv3);

        PetStoreService petStoreService2 = (PetStoreService)context.getBean("petStoreService");
        log.info("petStoreService2: {}", petStoreService2);

        PetStoreService petStoreService3 = context.getBean(PetStoreService.class);
        log.info("petStoreService3: {}", petStoreService3);
    }
}
