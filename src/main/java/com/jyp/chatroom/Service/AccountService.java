package com.jyp.chatroom.Service;

import com.jyp.chatroom.Entity.Account;

/**
 * Created by jyp on 2017/3/2.
 */
public interface AccountService {
    /**
     * 通过name和password进行登录
     * @param name
     * @param password
     * @return登录成功返回相应account，否则返回Null
     */
    public Account login(String name, String password);

}
