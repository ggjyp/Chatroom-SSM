package com.jyp.chatroom.Dao;

import com.jyp.chatroom.Entity.Account;

/**
 * Created by jyp on 2017/3/1.
 */
public interface AccountDao {
    /**
     * 根据id获得account信息
     * @param id
     * @return
     */
    Account getById(int id);

    /**
     * 根据name获得account信息
     * @param name
     * @return
     */
    Account getByName(String name);

}
