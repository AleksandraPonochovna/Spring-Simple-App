package com.dao;

import java.util.List;

import com.entity.User;

public interface UserDao {

    void add(User user);

    List<User> listUsers();

}
