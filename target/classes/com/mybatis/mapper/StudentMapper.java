package com.mybatis.mapper;
import  com.mybatis.pojo.Student;
import com.mybatis.pojo.Users;
import org.apache.ibatis.annotations.Param;
import java.util.List;
public interface StudentMapper {
    List<Student> FindAllStudents();

    Student DeleteStudentById(@Param("id") int id);

}
