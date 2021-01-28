package com.xingchaovv.spring.example.context01.container01.service;

import com.xingchaovv.spring.example.context01.container01.dao.AccountDao;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PetStoreService {

    {
        log.info("In init method");
    }

    private AccountDao accountDao;

    public AccountDao getAccountDao() {
        return accountDao;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
}
