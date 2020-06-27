package com.lea.proj.service;

import com.lea.proj.model.Users;

public interface UserService {
    /**
     * 用户注册
     *
     * @param
     * @return
     */
    void register(Users user);

    /**
     * 用户登录
     *
     * @param userName
     * @param password
     * @return
     */
    Users login(String userName, String password);

    /**
     * @param userName
     * @return
     */
    Users getUser(String userName);
}
