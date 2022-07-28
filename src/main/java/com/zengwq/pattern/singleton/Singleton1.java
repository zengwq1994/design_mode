package com.zengwq.pattern.singleton;

/**
 * 饿汉式，直接创建示例对象
 * 1、构造器私有化
 * 2、private static
 * 3、对外提供获取这个实例的方法getInstance
 */
public class Singleton1 {

    private Singleton1() {
    }

    private static Singleton1 instance = new Singleton1();

    public static Singleton1 getInstance() {
        return instance;
    }

}
