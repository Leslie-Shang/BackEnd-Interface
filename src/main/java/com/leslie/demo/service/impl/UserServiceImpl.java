package com.leslie.demo.service.impl;

import com.leslie.demo.entity.User;
import com.leslie.demo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

/**
 * @author Leslie
 * @description 用户业务实现类
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String addUser(User user) {
        // 直接编写业务逻辑
        return "success";
    }
}
