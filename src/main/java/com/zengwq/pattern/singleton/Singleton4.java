package com.zengwq.pattern.singleton;

/**
 * 懒汉式，线程不安全
 * 1、构造器私有化
 * 2、用静态变量保存实例
 * 3、提供静态方法，获取和创建实例对象
 */
public class Singleton4 {

    private Singleton4(){}

    private static Singleton4 instance;

    public static Singleton4 getInstance(){
        if(instance == null){
            instance = new Singleton4();
        }
        return instance;
    }
}
