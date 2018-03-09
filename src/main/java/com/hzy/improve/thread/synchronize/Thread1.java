package com.hzy.improve.thread.synchronize;

/**
 * Created by eju on 2018/3/8.
 */
public class Thread1 implements Runnable {
    private MyList myList;
    public Thread1(MyList myList){
        this.myList = myList;
    }
    public void run() {
        MyService myService = new MyService();
        myService.addServiceMethod(myList,"A");
    }
}
