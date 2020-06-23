package com.example.demo.design.singleton;

/**
 * 使用volatile关键字的双检锁
 */
public class SingletonDoubleCheck2 {
  /**
   * volatile关键字保证我在锁instance时, 禁止JVM重排序
   */
  private volatile static SingletonDoubleCheck2 instance = null;

  private SingletonDoubleCheck2() {

  }

  public static SingletonDoubleCheck2 getInstance() {
    if (instance == null) {
      // 再次减少锁的范围, 只锁instance变量
      synchronized (instance) {
        if (instance == null) {
          instance = new SingletonDoubleCheck2();
        }
      }
    }

    return instance;
  }
}
