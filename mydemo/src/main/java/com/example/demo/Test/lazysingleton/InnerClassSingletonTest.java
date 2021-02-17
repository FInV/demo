package com.example.demo.Test.lazysingleton;

/**
 * @author xuhuan
 * @date 2020/07/14
 */
public class InnerClassSingletonTest {

  public static void main(String[] args) {
    InnerClassSingleton innerClassSingleton = InnerClassSingleton.getInstance();
    InnerClassSingleton innerClassSingleton1 = InnerClassSingleton.getInstance();

    new Thread(()->{
      System.out.println("this"
          + "is"
          + "good");
    }).start();

  }
}

class InnerClassSingleton {

  private static class InnerClassHolder {

    private static InnerClassSingleton instance = new InnerClassSingleton();
  }

  private InnerClassSingleton() {

  }

  public static InnerClassSingleton getInstance(){
    return InnerClassHolder.instance;
  }


}
