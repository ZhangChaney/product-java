package edu.jxyy.Mapper;

import edu.jxyy.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from user where username=#{username} and password=#{password};")
    User login(String username, String password);

    @Select("select userid, username, phone, email from user;")
    List<User> getAllUser();

    @Delete("delete from user where userid=#{id}")
    void deleteUser(int id);

    @Insert("insert into user (username, password, phone, email) values (#{username}, #{password}, #{phone}, #{email})")
    void addUser(User user);

    @Update("update user set password=#{password}, phone=#{phone}, email=#{email} where userid=#{userid}")
    void updateUser(User user);

    @Select("select userid, username, phone, email from user where userid=#{userid};")
    User getUserById(int id);

}
