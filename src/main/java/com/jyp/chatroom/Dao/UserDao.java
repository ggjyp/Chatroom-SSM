package com.jyp.chatroom.Dao;

import com.jyp.chatroom.Entity.User;

/**
 * Created by jyp on 2017/3/1.
 */
public interface UserDao {
    /**
     * 根据id获得account信息
     * @param id
     * @return
     */
    User getById(int id);

    /**
     * 根据name获得account信息
     * @param name
     * @return
     */
    User getByName(String name);

}
