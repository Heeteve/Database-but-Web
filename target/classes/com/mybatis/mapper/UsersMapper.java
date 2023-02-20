package com.mybatis.mapper;
import com.mybatis.pojo.Users;
import org.apache.ibatis.annotations.Param;
import java.util.List;
public interface UsersMapper {
    List<Users> FindAllUsers();
    Users findUsersById(int id);
    List<Users> findUsersLikeName(@Param("username") String username);
    int updateUsersByUsername(Users users);
    //<!--    增加用户-->
    int addUsers(Users users);
    //<!--    删除用户-->
    int deleteUsersByUsername(@Param("username") String username);
    Users login(@Param("username") String username, @Param("password")String password);

}
