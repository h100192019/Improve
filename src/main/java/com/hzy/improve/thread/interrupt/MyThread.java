package com.hzy.improve.thread.interrupt;

/**
 * Created by eju on 2018/3/7.
 */
public class MyThread implements Runnable{

    public void run() {
        for(int i=1;i<=1000;i++){
            System.out.println("i="+i);
//            if(Thread.currentThread().isInterrupted()){
//                System.out.println("线程终止！");
//                break;
//            }


        }

//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            System.out.println(Thread.currentThread().getName()+"线程是否中断："+Thread.currentThread().isInterrupted());
//            Thread.currentThread().interrupt();
//        }
//        System.out.println(Thread.currentThread().getName()+"线程是否中断："+Thread.currentThread().isInterrupted());
    }
}
