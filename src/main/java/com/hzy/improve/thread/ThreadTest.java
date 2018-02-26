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

//        ThreadDemo threadDemo = new ThreadDemo("线程1");
//        threadDemo.start();

        int[] s = {1};
        RunnableDemo r1 = new RunnableDemo("线程1",s);
        RunnableDemo r2 = new RunnableDemo("线程2",s);
//        Thread thread1 = new Thread(r1);
//        Thread thread2 = new Thread(r2);
//        thread1.start();
//        thread2.start();

//        String[;] s = {"1","2","3"};
//        System.out.println(s[2]);
//        new ThreadTest().change(s);
//        System.out.println(s[2]);

        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        cachedThreadPool.execute(r1);
        cachedThreadPool.execute(r2);
    }

    public void change(String[] s){
        s[2] = "4";
    }
}
