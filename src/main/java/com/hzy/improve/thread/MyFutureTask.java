package com.hzy.improve.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * Created by eju on 2018/2/27.
 */
public class MyFutureTask {
    public static void main(String[] args) {

        MyCallable callable1 = new MyCallable(1000);

        MyCallable callable2 = new MyCallable(3000);

        FutureTask<String> futureTask1 = new FutureTask<String>(callable1);

        FutureTask<String> futureTask2 = new FutureTask<String>(callable2);

        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.execute(futureTask1);
        executor.execute(futureTask2);

        while(true){

            if(futureTask1.isDone() && futureTask2.isDone()){

                try {

                    System.out.println(futureTask1.get());
                    System.out.println(futureTask2.get());

                } catch (Exception e) {
                    e.printStackTrace();
                }

                System.out.println("allDone");
                executor.shutdown();
                break;
            }
        }
    }
}
