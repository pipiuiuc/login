package com.example.loginbackend.mapper;

import com.example.loginbackend.entity.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select * from account where username = #{text} or email = #{text}")
    Account findAccountByNameOrEmail(String text);
}
