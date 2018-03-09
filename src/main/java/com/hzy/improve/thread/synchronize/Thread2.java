package com.hzy.improve.thread.synchronize;

/**
 * Created by eju on 2018/3/8.
 */
public class Thread2 implements Runnable{
    private MyList myList;
    public Thread2(MyList myList){
        this.myList = myList;
    }
    public void run() {
        MyService myService = new MyService();
        myService.addServiceMethod(myList,"B");
    }
}
