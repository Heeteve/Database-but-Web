package com.mybatis.utlis;

import com.mybatis.mapper.StudentMapper;
import com.mybatis.pojo.Student;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import java.util.List;
public class StudentTest {
    @Test
    public void FindAllStudent() {
        SqlSession sqlSession = MyBatisUtil.getSession();
        StudentMapper studentMapper= sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = studentMapper.FindAllStudents();
        for (Student student : studentList) {
            System.out.println(student);
        }
        MyBatisUtil.closeSession();
    }
}
