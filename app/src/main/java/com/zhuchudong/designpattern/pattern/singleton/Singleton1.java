package com.zhuchudong.designpattern.pattern.singleton;

/**
 * 懒汉模式(在需要使用的时候才进行初始化)
 * 用户在第一次使用时进行初始化
 * 缺点：每次调用时都要进行同步
 */
public class Singleton1 {
    private static Singleton1 instance;

    private Singleton1() {
    }

    public static synchronized Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}

