package chatroom.dao;

import chatroom.BaseTest;
import com.jyp.chatroom.Dao.UserDao;
import com.jyp.chatroom.Entity.User;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * Created by jyp on 2017/3/3.
 */

public class UserDaoTest extends BaseTest{
    @Resource
    UserDao userDao;

    @Test
    public void testGetById(){
        User user = userDao.getById(1);
        System.out.println(user.toString());
    }

    @Test
    public void testGetByName(){
        User user = userDao.getByName("jyp");
        System.out.println(user.toString());
    }
}
