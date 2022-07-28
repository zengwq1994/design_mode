package com.zengwq.pattern.singleton;


import java.io.Serializable;

/**
 * 懒汉式，双重判断，解决锁的性能问题
 */
public class Singleton6 implements Serializable {
    private static int num = 0;

    // valitile禁止指令重排
    private volatile static Singleton6 singleton6;

    // 禁止多次反射调用构造器
    private Singleton6() {
        synchronized (Singleton6.class) {
            if (num == 0) {
                num++;
            } else {
                throw new RuntimeException("Don't use this method");
            }
        }
    }

    public static Singleton6 getSingleton() {
        if (singleton6 == null) {
            synchronized (Singleton6.class) {
                if (singleton6 == null) {
                    singleton6 = new Singleton6();
                }
            }
        }
        return singleton6;
    }
    // 禁止序列化的时候，重新生成对象
    private Object readResolve() {
        return singleton6;
    }
}
