package com.example.demo.design.singleton;

/**
 * 懒汉模式 -- 静态代码块实现
 */
public class Singleton4 {

  private static Singleton4 instance = null;

  static {
    instance = new Singleton4();
  }

  public static Singleton4 getInstance() {
    return instance;
  }
}