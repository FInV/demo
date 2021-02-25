package com.example.demo.thread;

import java.util.concurrent.Callable;

/**
 * @author xuhuan
 * @date 2021/02/18
 */
public class MyCallable implements Callable<Integer> {

  @Override
  public Integer call() {
    System.out.println(Thread.currentThread().getName() + " call()方法执行中...");
    return 1;
  }

}
