package com.example.demo.Test.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.LongAdder;


/**
 * @author xuhuan
 * @date 2020/07/22
 */
public class Test {
  static long count = 0L;
  static LongAdder a = new LongAdder();

  public static void main(String[] args) throws InterruptedException{
    Thread[] threads = new Thread[100];
    Object lock = new Object();
    for(int i=0;i<threads.length;i++){
      threads[i] = new Thread(new Runnable() {
        @Override
        public void run() {
         for(int k=0;k<100000;k++){
           a.add(1);
         }
        }
      });
    }


    for(Thread t : threads) t.start();
    for(Thread t : threads) t.join();

    System.out.println(a.sum());

  }
}
