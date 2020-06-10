package com.example.demo.Test.thread;


public class aduoxiancheng {
  public static void main(String[] args) {
    //3.创建继承Thread类的子类的实例
    myThread m1 = new myThread();
    myThread m2 = new myThread();
    //线程命名
    //myThread m1 = new myThread("线程1");
    //myThread m2 = new myThread();
    m2.setName("线程2");

    //4.调用对象的start()方法： ①启动线程  ②调用响应线程对应类的run()方法
    m1.start();  //再次 m1.start(); 就会返回非法的线程状态异常
    m2.start();
    //不可以直接用run()方法，并没有新开线程、

    for (int i=1;i<=100;i++){
      if(i%10==0){
        Thread.yield();  //yield(); 贡献出当前线程的执行权
      }
      System.out.println(Thread.currentThread().getName()+": "+i);
    }

  }

}