package com.hzy.improve.thread.synchronize;

/**
 * Created by eju on 2018/3/8.
 */
public class SynchronizedTest {
    public static void main(String[] args) throws InterruptedException{
        MyList myList = new MyList();

        Thread1 thread1 = new Thread1(myList);
        Thread t1 = new Thread(thread1);
        t1.setName("A组");
        t1.start();

        Thread2 thread2 = new Thread2(myList);
        Thread t2 = new Thread(thread2);
        t2.setName("B组");
        t2.start();

        Thread.sleep(6000);
        System.out.println("集合长度为："+myList.getSize());
    }
}
