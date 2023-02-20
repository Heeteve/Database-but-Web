package com.mybatis.controller;
import com.mybatis.mapper.StudentMapper;
import com.mybatis.mapper.UsersMapper;
import com.mybatis.pojo.Student;
import com.mybatis.pojo.Users;
import com.mybatis.utlis.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/deleteStudent")
public class deleteStudent extends HttpServlet {
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        HttpSession session = req.getSession();
        int id = Integer.parseInt(req.getParameter("id"));
        System.out.println("请求值："+id);
        Student student = doDelete(id);
        if (student != null) {
            session.setAttribute("student", student);

        } else {
            session.setAttribute("errorMsg", "删除失败");
            System.out.println("删除失败");
        }
    }
    public Student doDelete(int id) {
        SqlSession sqlSession = MyBatisUtil.getSession();
        StudentMapper studentMapper= sqlSession.getMapper(StudentMapper.class);
        Student student = studentMapper.DeleteStudentById(id);
        MyBatisUtil.closeSession();
        return student;
    }
}