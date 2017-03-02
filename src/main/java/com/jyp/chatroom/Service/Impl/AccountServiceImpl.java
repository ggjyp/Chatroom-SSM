package com.jyp.chatroom.Service.Impl;

import com.jyp.chatroom.Dao.AccountDao;
import com.jyp.chatroom.Entity.Account;
import com.jyp.chatroom.Service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jyp on 2017/3/2.
 */
@Service
public class AccountServiceImpl implements AccountService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //注入依赖
    @Autowired
    private AccountDao accountDao;

    @Override
    public Account login(String name, String password) {
        Account account = accountDao.getByName(name);
        if (password.equals(account.getPassword())){
            return account;
        }
        return null;
    }
}
