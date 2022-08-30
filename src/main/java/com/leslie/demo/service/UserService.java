package com.leslie.demo.service;

import com.leslie.demo.entity.User;

/**
 * @author Leslie
 * @description 用户业务接口
 */
public interface UserService {
    /**
     *
     * @param user 用户对象
     * @return 成功则返回"success"，失败则返回错误信息
     */
    String addUser(User user);
}
