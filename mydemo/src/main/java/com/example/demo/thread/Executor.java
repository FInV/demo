package com.example.demo.thread;

import java.util.Timer;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author xuhuan
 * @date 2021/02/18
 */
public class Executor {

  public static void main(String[] args) {
    ThreadPoolExecutor pool = new ThreadPoolExecutor(5,100,30, TimeUnit.SECONDS,new LinkedBlockingDeque<>(10000));

    pool.execute(()->sysout("abc"));

  }


  public static String sysout(String abc){
    System.out.println("shuchu"+abc);
    return "abc";
  }
}
