package chatroom.Dao;

import com.jyp.chatroom.Dao.AccountDao;
import com.jyp.chatroom.Entity.Account;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import chatroom.BaseTest;


/**
 * Created by jyp on 2017/3/2.
 */
public class AccountDaoTest extends BaseTest {

    @Autowired
    AccountDao accountDao;

    @Test
    public void testGetById() throws Exception{
        int id = 1;
        Account account = accountDao.getById(id);
        System.out.println(account.toString());
    }

}
