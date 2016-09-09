package com.fell.ssm.service;

import com.fell.ssm.pojo.User;

import java.util.List;

/**
 * Created by wb-xuzhenbin on 2016/6/23.
 */
public interface  UserService {
    /**
     * 查找所有用户
     */
    List<User> findUser()throws Exception;
    /***
     * 根据用户名查找账户信息
     */
    User findUserByName(String name)throws Exception;
    /***
     * 创建用户
     */
    int insert(User record)throws Exception;
}
