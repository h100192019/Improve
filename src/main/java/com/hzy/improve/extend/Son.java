package com.hzy.improve.extend;

/**
 * Created by eju on 2018/2/26.
 */
public class Son extends Father{

    public static void staticMethod(){
        System.out.println("子类静态方法");
    }

//    //静态代码块
//    static{
//        System.out.println("static code block in son");
//    }
//    //代码块
//    {
//        System.out.println("code block in son");
//    }
//    //构造
//    public Son(){
//        System.out.println("construction of son");
//    }
}
