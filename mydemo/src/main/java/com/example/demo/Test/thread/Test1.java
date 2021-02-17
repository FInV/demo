package com.example.demo.Test.thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xuhuan
 * @date 2020/07/22
 */
public class Test1 {

  Lock lock = new ReentrantLock();

  void m1() {
    try {
      lock.lock();
      System.out.println("t1 start");
        TimeUnit.SECONDS.sleep(Integer.MAX_VALUE);
        System.out.println("t2 end");


    } catch (InterruptedException e) {
      e.printStackTrace();
    } finally {
      lock.unlock();
    }
  }

  void m2() {
    try {
      boolean locked = false;
      //lock.lock();
      //locked = lock.tryLock(5, TimeUnit.SECONDS);
      lock.lockInterruptibly();
      System.out.println("m2 start");
      TimeUnit.SECONDS.sleep(5);
      System.out.println("m2 --- end");
    }catch (InterruptedException e){}
    finally {
      lock.unlock();
    }
  }


  public static void main(String[] args) {
    Test1 test1 = new Test1();
    new Thread(test1::m1).start();
    try {
      TimeUnit.SECONDS.sleep(1);


    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    new Thread(test1::m2).start();
  }
}
