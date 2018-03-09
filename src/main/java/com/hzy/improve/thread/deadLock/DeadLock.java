package com.hzy.improve.thread.deadLock;

import com.hzy.improve.thread.synchronize.Thread1;

/**
 * Created by eju on 2018/3/8.
 */
public class DeadLock implements Runnable {
    public String userName;
    public Object lock1 = new Object();
    public Object lock2 = new Object();

    public void setName(String userName){
        this.userName = userName;
    }

    public void run() {
        if(userName.equals("a")){
            synchronized (lock1){
                System.out.println("userName："+userName);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2){
                    System.out.println("lock1到lock2");
                }
            }

        }
        if(userName.equals("b")){
            synchronized (lock2){
                System.out.println("userName："+userName);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock1){
                    System.out.println("lock2到lock1");
                }
            }

        }
    }
}
