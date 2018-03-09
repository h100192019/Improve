package com.hzy.improve.thread.deadLock;

/**
 * Created by eju on 2018/3/8.
 */
public class DeadLockTest {
    public static void main(String[] args) {
        DeadLock deadLock = new DeadLock();
        deadLock.setName("a");
        Thread t1 = new Thread(deadLock);
        t1.start();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        deadLock.setName("b");
        Thread t2 = new Thread(deadLock);
        t2.start();
    }

    //斐波那契数列
//    int rabbitCount = 2;
//    public void rabbit(int beginMonth,int month){
//        for(int i = beginMonth;i<=month;i++){
//            if(i>=(beginMonth +2)){
//                rabbitCount += 2;
//                rabbit(i,month);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        DeadLockTest deadLock = new DeadLockTest();
//        deadLock.rabbit(1,20);
//        System.out.println(deadLock.rabbitCount);
//    }



}
