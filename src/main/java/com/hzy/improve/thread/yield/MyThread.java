package com.hzy.improve.thread.yield;

/**
 * Created by eju on 2018/3/7.
 */
public class MyThread extends Thread{

    @Override
    public void run() {
       long beginTime = System.currentTimeMillis();
       int count = 0;
       for(int i=0;i<500000;i++){
           //yield方法的作用是放弃当前CPU资源，将它让给其他任务去占用CPU执行时间。
           //但是放弃的时间不确定，可能刚刚放弃又马上获得CPU的时间片
           Thread.yield();
           count += i;
       }
       long endTime = System.currentTimeMillis();
        System.out.println("用时："+(endTime - beginTime));
    }
}
