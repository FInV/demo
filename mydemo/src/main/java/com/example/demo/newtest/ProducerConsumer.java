package com.example.demo.newtest;

import com.sun.org.apache.bcel.internal.generic.NEW;
import lombok.SneakyThrows;

/**
 * @author xuhuan
 * @date 2020/07/20
 */
public class ProducerConsumer {

  public static void main(String[] args) {
    SyncStack ss = new SyncStack();
    Producer producer = new Producer(ss);
    Consumer consumer = new Consumer(ss);
    new Thread(producer).start();
    new Thread(consumer).start();

  }
}
  class WoTou {

    int id;

    WoTou(int id) {
      this.id = id;

    }

    public String toString() {
      return "woid = " + id;
    }
  }


   class SyncStack {

    int index = 0;
    WoTou[] arrWT = new WoTou[6];

    public synchronized void push(WoTou woTou) throws InterruptedException {
      if (arrWT.length == index) {
        this.wait();//使用此对象的线程 停止
      }
      this.notify();//叫醒一个当前对象上 睡着的线程 继续执行
      arrWT[index] = woTou;
      index++;
    }

    public synchronized WoTou pop() throws InterruptedException {
      if(index == 0){
        this.wait();
      }
      this.notify();
      index--;
      return arrWT[index];
    }
  }

   class Producer implements Runnable {

    SyncStack syncStack = null;

    Producer(SyncStack syncStack) {
      this.syncStack = syncStack;
    }

    @SneakyThrows
    public void run() {
      for (int i = 0; i < 20; i++) {
        WoTou wt = new WoTou(i);
        syncStack.push(wt);
        System.out.println("生产了："+ wt.toString());
        Thread.sleep(1000);
      }
    }
  }

   class Consumer implements Runnable {

    SyncStack syncStack = null;

    Consumer(SyncStack syncStack) {
      this.syncStack = syncStack;
    }

    @SneakyThrows
    public void run() {
      for (int i = 0; i < 20; i++) {
        WoTou wt = syncStack.pop();
        System.out.println("消费了："+wt.toString());
        Thread.sleep(1000);
      }
    }
  }

