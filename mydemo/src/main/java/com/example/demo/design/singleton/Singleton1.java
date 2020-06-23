package com.example.demo.design.singleton;

/**
 * 饿汉模式, 线程安全, 但默认就创建实例, 占用空间
 * @author xuhuan
 * @date 2020/06/23
 */
public class Singleton1 {
  private static final Singleton1 instance = new Singleton1();

  private Singleton1() {
  }

  public static Singleton1 getIntance() {
    return instance;
  }
}
