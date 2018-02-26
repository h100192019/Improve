package com.hzy.improve.thread;

/**
 * Created by eju on 2018/2/1.
 */
public class ThreadDemo extends Thread {

    public ThreadDemo(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i =0;i<10;i++){
            System.out.println(this.getName() + "："+i);
        }
//        super.run();
        super.getState();
    }
}
