package com.nano.usercenter;

import com.baomidou.mybatisplus.core.toolkit.Assert;
import com.nano.usercenter.mapper.UserMapper;
import com.nano.usercenter.model.User;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import javax.annotation.Resource;
import java.util.List;

@SpringBootTest

public class UserCenterApplicationTests {

    @Resource
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        Assert.isTrue(5 == userList.size(), "");
        userList.forEach(System.out::println);
    }

}