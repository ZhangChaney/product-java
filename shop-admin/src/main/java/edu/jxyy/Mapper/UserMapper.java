package edu.jxyy.Mapper;

import edu.jxyy.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from user where username=#{username} and password=#{password};")
    User login(String username, String password);

    @Select("select  * from user;")
    List<User> getAllUser();
}
