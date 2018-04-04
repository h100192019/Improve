package com.hzy.improve.java8.lambda;

import java.util.*;

/**
 * Created by eju on 2018/3/21.
 */
public class LambdaExample {

    public static void main(String[] args) {
//        List<String> list = new ArrayList();
//        Arrays.asList("a","b","c").forEach((n) -> {
//            n += "a";
//            list.add(n);
//        });
//
//        list.forEach((n) -> {
//            System.out.println(n);
//        });
        Arrays.asList("a","b","c").sort((a,b) -> a.compareTo(b));

        List list= Collections.synchronizedList(new ArrayList<>());
//        Class.forName("LambdaExample")

    }
}
