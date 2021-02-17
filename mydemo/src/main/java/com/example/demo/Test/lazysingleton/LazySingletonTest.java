package com.example.demo.Test.lazysingleton;

/**
 * @author xuhuan
 * @date 2020/07/14
 */
public class LazySingletonTest {

  public static void main(String[] args) {
//    LazySingleton lazySingleton = LazySingleton.getInstance();
//    LazySingleton lazy = LazySingleton.getInstance();
//    System.out.println(lazy == lazySingleton);
    new Thread(()->{
      LazySingleton lazySingleton = LazySingleton.getInstance();
      System.out.println(lazySingleton);
    }).start();

    new Thread(()->{
      LazySingleton lazySingleton = LazySingleton.getInstance();
      System.out.println(lazySingleton);
    }).start();


  }
}

class LazySingleton {

  private volatile static LazySingleton instance;

  private LazySingleton() {
  }

  public static LazySingleton getInstance() {
    if (instance == null) {
      synchronized (LazySingleton.class){
        if(instance == null) {
          instance = new LazySingleton();
        }
      }

    }
    return instance;
  }

}