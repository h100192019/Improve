package com.hzy.improve.list;

import java.util.*;

/**
 * Created by eju on 2018/3/1.
 */
public class MyList {



    public static void main(String[] args) {
        List arrayList = new ArrayList();
        List linkedList = new LinkedList();
        List vector1 = new Vector();

        // List是有序的Collection，使用此接口能够精确的控制每个元素插入的位置。
        // 用户能够使用索引（元素在List中的位置，类似于数组下标）来访问List中的元素，这类似于Java的数组。
        // 和Set不同，List允许有相同的元素。
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(null);
        arrayList.add("qweq");

//        System.out.println(arrayList.size());
//        for(Iterator it = arrayList.iterator();it.hasNext();){
//            System.out.println(it.next());
//        }

        //ListIterator 支持遍历过程中给list添加元素
        ListIterator iterator = arrayList.listIterator();
        for(;iterator.hasNext();){
            System.out.println(iterator.next());
            iterator.add((int)(Math.random() * 100));
        }
        for(;iterator.hasPrevious();){
            System.out.println(iterator.previous());
        }


        List list = Collections.synchronizedList(new LinkedList());
        synchronized (new LinkedList<String>()){

        }

    }

    Set set = new HashSet();
}
