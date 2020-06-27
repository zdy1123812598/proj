package com.lea.proj.service.impl;

import com.lea.proj.dao.UsersMapper;
import com.lea.proj.model.Users;
import com.lea.proj.model.UsersExample;
import com.lea.proj.service.UserService;
import com.lea.proj.service.exception.PasswordNotException;
import com.lea.proj.service.exception.UsernameNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServieImpl implements UserService {

    @Autowired
    private UsersMapper usersMapper;

    //用户注册业务逻辑
    @Override
    public void register(Users users) {
        System.out.print("用户" + users.getUserName() + "密码:" + users.getPassword());
        //判断用户名是否为null
        String userName = users.getUserName();
        UsersExample usersExample = new UsersExample();
        UsersExample.Criteria usersExampleCriteria = usersExample.createCriteria();
        if (!"".equals(userName)) {
            usersExampleCriteria.andUserNameEqualTo(userName);
        }
        List<Users> usersList = usersMapper.selectByExample(usersExample);

        if (usersList.size() > 0) {
            throw new UsernameNotFoundException("注册名被占用");
        }
        usersMapper.insert(users);
    }

    //用户登录业务逻辑
    @Override
    public Users login(String userName, String password) {
        Users result = this.getUser(userName);
        if (result == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        if (!password.equals(result.getPassword())) {
            throw new PasswordNotException("密码错误");
        }

        Users user = new Users();
        user.setUserName(userName);
        user.setPassword(password);
        return user;
    }

    @Override
    public Users getUser(String userName) {
        UsersExample usersExample = new UsersExample();
        UsersExample.Criteria usersExampleCriteria = usersExample.createCriteria();
        if (!"".equals(userName)) {
            usersExampleCriteria.andUserNameEqualTo(userName);
        }
        List<Users> usersList = usersMapper.selectByExample(usersExample);
        if (usersList.size() != 1) {
            throw new UsernameNotFoundException("用户名存在问题");
        }
        Users users = usersList.get(0);
        return users;
    }
}