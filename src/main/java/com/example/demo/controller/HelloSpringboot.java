package com.example.demo.controller;

import com.example.demo.VO.ResultVO;
import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;
import com.example.demo.util.ResultVOUtil;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloSpringboot {

  @Autowired
  UserService userService;

  @RequestMapping("/hello")
  public String say() {
    System.out.println("Hello springboot");
    return "hello,this is a springboot demo";
  }

  @RequestMapping("/ListUser")
  public ResultVO ListUser() {
    List<UserEntity> list = userService.listUser();
    System.out.println("list = " + list);
    return ResultVOUtil.success(list);
  }
}