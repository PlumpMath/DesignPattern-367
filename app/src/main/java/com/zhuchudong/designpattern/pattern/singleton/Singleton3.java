package com.zhuchudong.designpattern.pattern.singleton;

/**
 * 静态内部类单例模式
 * 只有第一次调用 getInstance 时候才会初始化
 * 优点：线程安全 对象唯一  延迟了单例的实例化
 */
public class Singleton3 {
    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        return SingletonHolder.instance;
    }

    private static class SingletonHolder {
        private static final Singleton3 instance = new Singleton3();
    }
}
