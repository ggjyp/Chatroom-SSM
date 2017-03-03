package com.jyp.chatroom.Service.Impl;

import com.jyp.chatroom.Dao.UserDao;
import com.jyp.chatroom.Entity.User;
import com.jyp.chatroom.Service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by jyp on 2017/3/3.
 */
@Service
public class UserServiceImpl implements UserService{
    @Resource
    private UserDao userDao;

    @Override
    public User login(String name, String password) {
        User user = userDao.getByName(name);
        if(user.getPassword().equals(password)){
            return user;
        }
        return null;
    }
}
