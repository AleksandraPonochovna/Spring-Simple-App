package com.service;

import java.util.List;

import com.entity.User;

public interface UserService {

    void add(User user);

    List<User> listUsers();

}
