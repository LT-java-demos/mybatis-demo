package com.lt.rs.service;

import com.lt.rs.dao.UserMapper;
import com.lt.rs.model.User;
import com.lt.rs.util.JDBCUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserService {

    public List findAllUsers() {
        SqlSession session = JDBCUtil.getSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        List users = userMapper.findAllUsers();
        JDBCUtil.closeSession(session);
        return users;
    }

    public User findUserById(Integer id) {
        SqlSession session = JDBCUtil.getSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        User user = userMapper.findUserById(1);
        JDBCUtil.closeSession(session);
        return user;
    }
}
