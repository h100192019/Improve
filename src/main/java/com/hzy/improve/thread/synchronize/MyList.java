package com.hzy.improve.thread.synchronize;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eju on 2018/3/8.
 */
public class MyList {
    private List list = new ArrayList();
    public void add(String data){
        list.add(data);
    }

    public int getSize(){
        return list.size();
    }
}
