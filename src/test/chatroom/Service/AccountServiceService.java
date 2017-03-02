package chatroom.Service;

import chatroom.BaseTest;
import com.jyp.chatroom.Entity.Account;
import com.jyp.chatroom.Service.AccountService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Created by jyp on 2017/3/2.
 */
public class AccountServiceService extends BaseTest {
    @Autowired
    AccountService accountService;

    @Test
    public void testLogin()throws Exception{
        String name = "jyp";
        String password = "123456";
        Account account = accountService.login(name, password);
        System.out.println(account.toString());
    }

}
