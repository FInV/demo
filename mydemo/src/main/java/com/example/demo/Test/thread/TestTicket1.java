package com.example.demo.Test.thread;

public class TestTicket1 {
  public static void main(String[] args) {
    //3. 创建一个实现接口的子类对象
    Ticket1 t = new Ticket1();
    //4. 将创建的子类对象作为形参传递给Thread类的构造器
    Thread t1 = new Thread(t);
    Thread t2 = new Thread(t);
    Thread t3 = new Thread(t);

    t1.setName("t1窗口");
    t2.setName("t2窗口");
    t3.setName("t3窗口");

    t1.start();
    t2.start();
    t3.start();
  }
}