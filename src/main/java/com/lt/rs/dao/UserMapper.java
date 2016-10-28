package com.lt.rs.dao;

import com.lt.rs.model.User;

import java.util.List;

public interface UserMapper {

    List findAllUsers();

    User findUserById(Integer id);
}
