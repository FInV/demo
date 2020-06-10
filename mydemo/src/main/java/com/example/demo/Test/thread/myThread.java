package com.example.demo.Test.thread;

/*
Thread：

1.创建多线程的第一个方式

2.Thread类你的常用的方法：
   2.1 getName();
   2.2 setName();
   2.3 start()：开启一个线程并调用响应的run()执行
   2.4 run();
   2.5 yield(); “贡献”出当前线程对cpu的获取
   2.6 join(); 在a线程中调用b线程的join()方法，那么当b线程完全执行完以后，a线程才可能开始执行

 */



//1. 声明类继承Thread类
class myThread extends Thread{

  //2.重写run()方法，这是创建的多线程的执行的主体
  public void run(){
    for(int i=1;i<101;i++){
      System.out.println(Thread.currentThread().getName()+": "+i);
    }
  }
}

