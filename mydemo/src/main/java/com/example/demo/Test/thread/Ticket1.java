package com.example.demo.Test.thread;

//1. 创建实现Runnable接口的类
class Ticket1 implements  Runnable{
  int ticket =100;
  Object obj = new Object(); //必须定义到run方法以外。类似wc的灯
  //2. 重写Runnable接口中的抽象方法
  public  void run(){
    while(true){
      show();
    }
  }

  //同步方法的方式  加synchronized 关键字
  public synchronized void show(){   //同步方法默认的锁是当前对象
    if (ticket > 0) {
      try{
        Thread.currentThread().sleep(100);
      }catch(InterruptedException e){
        e.printStackTrace();
      }
      System.out.println(Thread.currentThread().getName() + "售票，票号位：" + ticket--);
    }
  }
}