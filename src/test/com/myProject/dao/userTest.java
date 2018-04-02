import com.myProject.controller.UserDao;
import com.myProject.dao.AuthUser;
import com.myProject.dao.AuthUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


/**
 * Created by acer on 2018/4/2.
 */
@ContextConfiguration("classpath:spring/spring-mybatis.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class userTest {
    @Autowired
    protected UserDao userDao;

    @Test
    public void selectByPrimary() throws Exception{
        int id = 1;
        AuthUser user = userDao.selectByPrimaryKey(id);
        System.out.print(user.getPassword());
    }
}
