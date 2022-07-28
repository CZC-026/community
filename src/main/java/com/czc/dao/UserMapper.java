package com.czc.dao;

import com.czc.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    //通过id获取用户
    User selectById(int id);
    //通过name获取用户
    User selectByName(String name);
    //通过email获取用户
    User selectByEmail(String email);
    //插入用户
    int insertUser(User user);
    //更新用户状态
    int updateStatus(int id, int status);
    //更新用户头像
    int updateHeader(int id,String headerUrl);
    //更新用户密码
    int updatePassword(int id, String password);
}
