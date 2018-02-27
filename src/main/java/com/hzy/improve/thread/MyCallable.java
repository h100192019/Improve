package com.hzy.improve.thread;

import java.util.concurrent.Callable;

/**
 * Created by eju on 2018/2/27.
 */
public class MyCallable implements Callable<String>{

    private long waitTime;

    public MyCallable(int times){
        this.waitTime = times;
    }

    public String call() throws Exception {

        Thread.sleep(waitTime);

        return Thread.currentThread().getName();
    }
}
