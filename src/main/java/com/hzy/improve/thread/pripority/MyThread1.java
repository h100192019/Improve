package com.hzy.improve.thread.pripority;

/**
 * Created by eju on 2018/3/7.
 */
public class MyThread1 implements Runnable{

    public void run() {
        System.out.println(Thread.currentThread().getName() + "优先级为：" + Thread.currentThread().getPriority());
        MyThread2 thread2 = new MyThread2();
        Thread t2 = new Thread(thread2);
        t2.start();
    }
}
