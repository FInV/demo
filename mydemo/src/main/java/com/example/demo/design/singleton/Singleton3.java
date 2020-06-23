package com.example.demo.design.singleton;


/**
 * 静态内部类实现 -- 延迟加载
 *
 * 天生线程安全
 */
public class Singleton3 {

  /**
   * 私有化构造
   */
  private Singleton3() {
    System.out.println("初始化");
  }

  /**
   * 静态内部类
   */
  private static class InnerObject{
    private static Singleton3 instance = new Singleton3();
  }

  public static Singleton3 getInstance() {
    return InnerObject.instance;
  }

  public static void main(String[] args) {
    getInstance();
  }
}