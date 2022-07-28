package com.zengwq.pattern.singleton;

/**
 * 饿汉式，静态代码块
 */
public class Singleton3 {

    private Singleton3(){}

    private static Singleton3 instance;

    static {
        instance = new Singleton3();
    }

    public static Singleton3 getInstance(){
        return instance;
    }
}
