package com.fell.ssm.service;

import com.fell.ssm.mapper.UserMapper;
import com.fell.ssm.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Created by wb-xuzhenbin on 2016/6/23.
 */
@Service
public class UserServiceImpl implements UserService {

    //User接口
    @Autowired
    private UserMapper userMapper;

    public List<User> findUser() throws Exception {
        //调用mapper类中的selectByExample方法，如果传入类型为null，则表示无条件查找
        List<User> users = userMapper.selectByExample(null);
        return users;
    }

    public User findUserByName(String name) throws Exception {
        //调用mapper类中的selectByName
        User users = userMapper.selectByName(name);
        return users;
    }
    /***
     * 创建用户 int insert(User record);
     */
    public int insert(User record) throws Exception {
       int id = userMapper.insert(record);
        return id;
    }
}