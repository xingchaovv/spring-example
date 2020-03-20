package com.xingchaovv.spring.example.modules.dependency.repository;

import com.xingchaovv.spring.example.modules.dependency.domain.User;
import org.springframework.beans.factory.BeanFactory;

import java.util.Collection;

/**
 * 用户信息仓库
 */
public class UserRepository {

    private Collection<User> users;
    private BeanFactory beanFactory;

    public Collection<User> getUsers() {
        return users;
    }

    public void setUsers(Collection<User> users) {
        this.users = users;
    }

    public BeanFactory getBeanFactory() {
        return beanFactory;
    }

    public void setBeanFactory(BeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }
}
