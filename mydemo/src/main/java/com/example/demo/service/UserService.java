package com.example.demo.service;

import com.example.demo.entity.UserEntity;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * @author xuhuan
 * @date 2020/05/26
 */
@Service
public interface UserService {

  List<UserEntity> listUser();
}
