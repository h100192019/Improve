package com.hzy.improve.thread;

import java.math.BigDecimal;

/**
 * Created by eju on 2018/2/1.
 */
public class RunnableDemo implements Runnable {

    private String name;

    private BigDecimal bigDecimal;

    private int[] ints;

    public RunnableDemo(String runnableName) {
        this.name = runnableName;
    }

    public RunnableDemo(String runnableName, int[] s) {
        this.name = runnableName;
        this.ints = s;
    }

    public synchronized void run() {
        //        System.out.println(this.name + "开始run......");
        //        for(int i = 0 ;i < 100;i++){
        //            System.out.println(this.name + "开始打印："+i);
        //        }
        //        int i = strings.length;
//        synchronized (RunnableDemo.class) {
            for (int i = 1; i < 5; i++) {
                try {
                    Thread.sleep(50);
                } catch (Exception e) {

                }
                ints[0] += i;
                System.out.println(this.name + "开始打印：" + ints[0]);
            }
//        }
    }
}
