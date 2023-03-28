package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserMapper {

    @Select("select * from user")
    List<User> findAll();

    @Update("INSERT INTO  `user` (`name`,`address`,`age`,`sex`,`phone`) VALUE(#{name},#{address},#{age},#{sex},#{phone})")
    //事务的处理
    @Transactional
    void save(User user);

    @Update("")
    void update(User user);
}
