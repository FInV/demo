package com.example.demo.Test.thread;

/**三个窗口一起卖100张票
 * @author xuhuan
 * @date 2020/06/10
 */

class  Ticket extends  Thread{
  static int ticket =100;

  public synchronized void run(){
     while(true){
      if(ticket>0){
        System.out.println(Thread.currentThread().getName()+"售票，票号位：" + ticket--);
      }
    }
  }
}