package com.mybatis.controller;

import com.mybatis.mapper.UsersMapper;
import com.mybatis.pojo.Users;
import com.mybatis.utlis.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

public class UserLogin {
    public Users doLogin(String username, String password) {
        SqlSession sqlSession = MyBatisUtil.getSession();
        UsersMapper usersMapper= sqlSession.getMapper(UsersMapper.class);
        Users users = usersMapper.login(username, password);
        System.out.println(username + " " + password);
        MyBatisUtil.closeSession();
        return users;
    }
}
