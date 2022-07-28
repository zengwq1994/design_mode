package com.zengwq.pattern.singleton;

/**
 * 懒汉式，静态内部类
 */
public class Singleton7 {

    private Singleton7(){}

    private static class Singleton6Holder{
        private static final Singleton7 INSTANCE = new Singleton7();
    }

    public static Singleton7 getInstance(){
        return Singleton6Holder.INSTANCE;
    }
}
