package com.cjs.example.service.impl;

import com.cjs.example.dao.UserDao;
import com.cjs.example.domain.SysUser;
import com.cjs.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public SysUser getUserByName(String username) {
        return userDao.selectByName(username);
    }
}
