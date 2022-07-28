package com.zengwq.pattern.singleton;

/**
 * 懒汉式，synchronized锁
 */
public class Singleton5 {

    private Singleton5(){}

    private static Singleton5 instance;

    public static synchronized Singleton5 getInstance(){
        if(instance == null){
            instance = new Singleton5();
        }
        return instance;
    }
}
