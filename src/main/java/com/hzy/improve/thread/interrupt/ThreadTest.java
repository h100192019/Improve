package com.hzy.improve.thread.interrupt;

/**
 * Created by eju on 2018/3/7.
 */
public class ThreadTest {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread t1 = new Thread(myThread);
        t1.start();
//        try {
//            Thread.sleep(10);
//        }catch (Exception e){
//
//        }
//
//        t1.interrupt();
//        System.out.println(t1.getName()+"是否停止："+t1.interrupted());
//        System.out.println(Thread.currentThread().getName()+"是否停止："+Thread.currentThread().interrupted());
//        System.out.println(t1.getName()+"是否停止："+t1.isInterrupted());
//        System.out.println(Thread.currentThread().getName()+"是否停止："+Thread.currentThread().isInterrupted());

//        Thread.currentThread().interrupt();
//        System.out.println(Thread.currentThread().getName()+"是否停止："+Thread.currentThread().interrupted());
//        System.out.println(Thread.currentThread().getName()+"是否停止："+Thread.currentThread().isInterrupted());
//        System.out.println(Thread.currentThread().getName()+"是否停止："+Thread.currentThread().interrupted());

//        try {
//            Thread.sleep(200);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        t1.interrupt();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
