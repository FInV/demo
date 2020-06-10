package com.example.demo.Test.thread;

public class TestTicket {

  public static void main(String[] args) {
    Ticket t1 = new Ticket();
    Ticket t2= new Ticket();
    Ticket t3 = new Ticket();

    t1.setName("t1窗口");
    t2.setName("t1窗口");
    t3.setName("t1窗口");

    t1.start();
    t2.start();
    t3.start();
  }
}