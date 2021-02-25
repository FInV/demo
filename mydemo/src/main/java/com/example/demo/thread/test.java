package com.example.demo.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author xuhuan
 * @date 2021/02/18
 */
public class test {
  public static void main(String[] args) {
    FutureTask<Integer> futureTask = new FutureTask<Integer>(new MyCallable());
    Thread thread = new Thread(futureTask);
    thread.start();

    A.B b = new A().new B();

    b.setB(1);
    try {
      Thread.sleep(1000);
      System.out.println("返回结果 " + futureTask.get());
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      e.printStackTrace();
    }
    System.out.println(Thread.currentThread().getName() + " main()方法执行完成");
  }
}
