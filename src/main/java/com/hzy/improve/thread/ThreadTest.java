package com.hzy.improve.thread;

import java.math.BigDecimal;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by eju on 2018/2/1.
 */
public class ThreadTest {

    public static void main(String[] args) throws InterruptedException {
//        RunnableDemo r1 = new RunnableDemo("线程1");
//        Thread t1 = new Thread(r1,"线程1");
//        t1.start();
//
//
//        RunnableDemo r2 = new RunnableDemo("线程2");
//        Thread t2 = new Thread(r2,"线程2");
//        t2.start();

        ThreadDemo threadDemo = new ThreadDemo("线程1");
        ThreadDemo threadDemo2 = new ThreadDemo("线程2");

        threadDemo.start();

        threadDemo2.start();
        /**join的意思是使得放弃当前线程的执行，并返回对应的线程，例如下面代码的意思就是：
         程序在main线程中调用t1线程的join方法，则main线程放弃cpu控制权，并返回t1线程继续执行直到线程t1执行完毕
         所以结果是t1线程执行完后，才到主线程执行，相当于在main线程中同步t1线程，t1执行完了，main线程才有执行的机会
         */
        threadDemo2.join();

//        threadDemo.interrupt();
//        System.out.println("是否终止："+threadDemo.isInterrupted());
//        System.out.println("是否终止："+threadDemo.isInterrupted());

//        int[] s = {1};
//        RunnableDemo r1 = new RunnableDemo("线程1",s);
//        RunnableDemo r2 = new RunnableDemo("线程2",s);
//        Thread thread1 = new Thread(r1);
//        Thread thread2 = new Thread(r2);
//        thread1.start();
//        thread2.start();

//        String[;] s = {"1","2","3"};
//        System.out.println(s[2]);
//        new ThreadTest().change(s);
//        System.out.println(s[2]);

//        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
//        cachedThreadPool.execute(r1);
//        cachedThreadPool.execute(r2);
    }

    public void change(String[] s){
        s[2] = "4";
    }
}
