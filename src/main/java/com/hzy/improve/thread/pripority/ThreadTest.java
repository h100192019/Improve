package com.hzy.improve.thread.pripority;

/**
 * Created by eju on 2018/3/7.
 */
public class ThreadTest {
    public static void main(String[] args) {
        //设置线程优先级有助于帮“线程规划器”确定在下一次选择哪个线程来优先执行
        //线程优先级分为1-10个等级，超出或小于会throw new IllegalArgumentException
        //线程优先级有继承性，比如A线程启动B线程，则B线程的优先级与A一样
        System.out.println(Thread.currentThread().getName() + "优先级为：" + Thread.currentThread().getPriority());
//        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        System.out.println(Thread.currentThread().getName() + "优先级为：" + Thread.currentThread().getPriority());
        MyThread1 thread1 = new MyThread1();
        Thread t1 = new Thread(thread1);
        t1.start();
    }
}
