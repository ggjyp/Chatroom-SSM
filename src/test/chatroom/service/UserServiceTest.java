package chatroom.service;

import chatroom.BaseTest;
import com.jyp.chatroom.Entity.User;
import com.jyp.chatroom.Service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * Created by jyp on 2017/3/3.
 */
public class UserServiceTest extends BaseTest{
    @Resource
    UserService userService;

    @Test
    public void testLogin(){
        User user = userService.login("jyp","jyp");
        System.out.println(user.toString());
    }
}
