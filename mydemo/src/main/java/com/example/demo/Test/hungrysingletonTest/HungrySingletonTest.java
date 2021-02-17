package com.example.demo.Test.hungrysingletonTest;

/**
 * @author xuhuan
 * @date 2020/07/14
 */
public class HungrySingletonTest {

  public static void main(String[] args) {

  }
}

class HungrySingleton {

  private static HungrySingleton instance = new HungrySingleton();

  private HungrySingleton() {
  }

  public static HungrySingleton getInstance() {
    return instance;
  }
}