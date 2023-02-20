package com.mybatis.utlis;

import com.mybatis.mapper.UsersMapper;
import com.mybatis.pojo.Users;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UsersTest {
    /*@Test
    public void FindAllUsers() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sessionFactory.openSession();
        List<Users> usersList = sqlSession.selectList("test.user.findUsersLikeName", "三");
        for (Users users : usersList) {
            System.out.println(users);
        }
        Users users = sqlSession.selectOne("test.user.findUsersLikeName", "三");
        System.out.println(users);
        sqlSession.close();
    }*/
    @Test
    public void findUsersLikeName() {
        SqlSession sqlSession = MyBatisUtil.getSession();
        UsersMapper usersMapper= sqlSession.getMapper(UsersMapper.class);
        List<Users> usersList = usersMapper.findUsersLikeName("三");
        for(Users users:usersList){
            System.out.println(users);
        }
        MyBatisUtil.closeSession();
    }

    @Test
    public void updateUserById(){
        Users user=new Users(1,"张三","666",0);
        SqlSession sqlSession = MyBatisUtil.getSession();
        UsersMapper usersMapper= sqlSession.getMapper(UsersMapper.class);
        int i=usersMapper.updateUsersByUsername(user);
        sqlSession.commit();
        System.out.println(i);
        MyBatisUtil.closeSession();
    }

    @Test
    public void addUser(){
        Users user=new Users("赵四","123",0);
        SqlSession sqlSession = MyBatisUtil.getSession();
        UsersMapper usersMapper= sqlSession.getMapper(UsersMapper.class);
        int i=usersMapper.addUsers(user);
        sqlSession.commit();
        System.out.println(i);
        MyBatisUtil.closeSession();
    }

    @Test
    public void deleteUser(){
        SqlSession sqlSession = MyBatisUtil.getSession();
        UsersMapper usersMapper= sqlSession.getMapper(UsersMapper.class);
        int i=usersMapper.deleteUsersByUsername("赵四");
        sqlSession.commit();
        System.out.println(i);
        MyBatisUtil.closeSession();
    }
}
