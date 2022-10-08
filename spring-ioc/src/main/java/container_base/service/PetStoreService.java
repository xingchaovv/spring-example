package container_base.service;

import container_base.dao.AccountDao;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ToString
public class PetStoreService {

    public String name = "My PetStoreService.";

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
