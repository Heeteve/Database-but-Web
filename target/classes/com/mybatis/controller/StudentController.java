package com.mybatis.controller;

import com.mybatis.mapper.StudentMapper;
import com.mybatis.pojo.Student;
import com.mybatis.utlis.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/getAllStu")
public class StudentController  extends HttpServlet {
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        HttpSession session = req.getSession();
        List<Student> studentList = findAllStudents();
        session.setAttribute("studentList", studentList);
        resp.sendRedirect("student.jsp");
    }

    public List<Student> findAllStudents() {
        SqlSession sqlSession = MyBatisUtil.getSession();
        StudentMapper studentMapper= sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = studentMapper.FindAllStudents();
        for (Student student : studentList) {
            System.out.println(student);
        }
        System.out.println("查询成功");
        MyBatisUtil.closeSession();
        return studentList;
    }
}

