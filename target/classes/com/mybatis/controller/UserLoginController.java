package com.mybatis.controller;

import com.mybatis.mapper.UsersMapper;
import com.mybatis.pojo.Users;
import com.mybatis.utlis.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/doLogin")
public class UserLoginController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        HttpSession session = req.getSession();
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println("请求值："+username + " " + password);
        Users users = doLogin(username, password);
        if (users != null) {
            session.setAttribute("users", users);
            resp.sendRedirect("home.html");
        } else {
            session.setAttribute("errorMsg", "用户名或密码错误");
            resp.sendRedirect("loginfail.html");
            System.out.println("登录失败");
        }
    }
    public Users doLogin(String username, String password) {
        SqlSession sqlSession = MyBatisUtil.getSession();
        UsersMapper usersMapper= sqlSession.getMapper(UsersMapper.class);
        Users users = usersMapper.login(username, password);
        MyBatisUtil.closeSession();
        return users;
    }
}
