package com.example.demo.mapper;

import com.example.demo.entity.UserEntity;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author xuhuan
 * @date 2020/05/26
 */
@Mapper
public interface UserMapper {

  void delete(int id);

  void insertUser(UserEntity userEntity);

  void Update(UserEntity userEntity);

  List<UserEntity> ListUser();

  List<UserEntity> findUserByName(String name);
}
