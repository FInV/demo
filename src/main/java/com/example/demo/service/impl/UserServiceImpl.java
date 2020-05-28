package com.example.demo.service.impl;

import com.example.demo.entity.UserEntity;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xuhuan
 * @date 2020/05/26
 */
@Service
public class UserServiceImpl implements UserService {

  @Autowired
  UserMapper userMapper;

  public List<UserEntity> listUser() {
    List<UserEntity> userEntityList = userMapper.ListUser();
    return userEntityList;
  }
}
