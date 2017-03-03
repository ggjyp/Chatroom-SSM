package com.jyp.chatroom.Service;

import com.jyp.chatroom.Entity.User;

/**
 * Created by jyp on 2017/3/3.
 */
public interface UserService {
    /**
     * 通过name,password进行登录
     * @param name
     * @param password
     * @return登录成功返回User，否则返回null
     */
    User login(String name, String password);
}
