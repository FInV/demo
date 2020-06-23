package com.example.demo.design.singleton;


/**
 * 懒汉模式--双检索
 *
 * 为了在懒汉模式的基础上，保证线程安全, 出现了双检锁的设计，但是有出现了另一个问题。
 *
 * 在new SingletonDoubleCheck()时，是非原子性的，实际分为三步
 *
 * new 分配内存空间
 * 初始化对象
 * 将对象指向刚分配的内存空间
 * 但JVM编译器，为了性能考虑，可能重新排序2,3两个, 变为:
 *
 * new 分配内存空间
 * 将对象指向刚分配的内存空间
 * 初始化对象
 * 举例说明：
 *
 * 线程1检查到instance为空，获取锁，再次检查instance为空，为instance分配内存空间，指向内存空间，这时线程2检查到instance不为空，直接返回instance，但此时对象还没有初始化完成
 */
public class SingletonDoubleCheck {
  private static SingletonDoubleCheck instance = null;

  private SingletonDoubleCheck() {

  }

  public static SingletonDoubleCheck getInstance() {
    if (instance == null) {
      synchronized (SingletonDoubleCheck.class) {
        if (instance == null) {
          instance = new SingletonDoubleCheck();
        }
      }
    }

    return instance;
  }
}