package site.paranoia;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import site.paranoia.domain.User;
import site.paranoia.mapper.UserMapper;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleTest {

    @Autowired
    UserMapper userMapper;

    @Test
    public void testSelect() {
        List<User> userList = userMapper.selectUserList();
        userList.forEach(System.out::println);
    }
}
