package com.hzy.improve.thread.synchronize;

import java.util.List;

/**
 * Created by eju on 2018/3/8.
 */
public class MyService {

    //这里对list进行同步，则不会出现“脏读”，对整个方法同步依然会出现”脏读“
    //这是因为MyService对象不是单例的，在两个Thread里面分别new了两个Service
    //但是list是单例的,list是从main方法里面传过来的，所以对list同步则不会出现"脏读"
    public void addServiceMethod(MyList list,String data){
        try {
//            synchronized (list){
                if(list.getSize() < 1){
                    Thread.sleep(2000);
                    list.add(data);
                }
//            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
