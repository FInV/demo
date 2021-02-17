package com.example.demo.Test.lazysingleton;

/**
 * @author xuhuan
 * @date 2020/07/21
 */
public class Singleton {

  public static void main(String[] args) {

  }
}

class Sing {

  private static Sing instance;

  private Sing() {

  }

  public static Sing getIntance() {

    if (instance == null) {
      synchronized (Sing.class){
        if(instance == null){
          instance = new Sing();
        }
      }
      instance = new Sing();
    }
    return instance;
  }


}