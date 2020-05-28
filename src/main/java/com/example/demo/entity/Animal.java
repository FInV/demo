package com.example.demo.entity;

import lombok.Data;

/**
 * @author xuhuan
 * @date 2020/05/26
 */
@Data
public class Animal {
  String id;
  String name;

  public Animal(String n, String m) {   //有参数构造函数，实现给private成员变量传参数值的功能
    name = m;
    id = n;
  }
}
