package com.xingchaovv.spring.example.modules.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Slf4j
public class BeanInit implements InitializingBean {

    @PostConstruct
    public void init() {
        log.info("BeanInit init 初始化");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("BeanInit afterPropertiesSet 初始化");
    }

    @PreDestroy
    public void destroy() {
        log.info("BeanInit PreDestroy 销毁");
    }
}
