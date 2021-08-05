package com.test.jichu;

public class Singleton {
    private static  Singleton singleton = null;
    private Singleton(){};

    private static Singleton getInstence(){ //懒汉式，线程不安全
        if(singleton==null){
            synchronized(Singleton.class){
                if(singleton==null){
                    singleton =  new Singleton();
                }
            }
        }
        return  singleton;
    }

   /* private static  Singleton singleton = new Singleton();   //数据库连接池等 读取配置文件的类等
    private Singleton getInstence(){ //饿汉式 线程安全
        return singleton;
    }*/



}
