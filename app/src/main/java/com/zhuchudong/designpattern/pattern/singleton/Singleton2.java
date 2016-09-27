package com.zhuchudong.designpattern.pattern.singleton;

/**
 * Double Check Lock
 * 具有懒汉模式优点，还能保证线程安全，且使用时不用进行同步锁
 */
public class Singleton2 {
    private static Singleton2 instatnce;

    private Singleton2() {
    }

    public static Singleton2 getInstatnce() {
        //第一个判断，避免不必要的同步
        if (instatnce == null) {
            synchronized (Singleton2.class) {
                //第二层判断，在null的情况下进行创建
                if (instatnce == null) {
                    instatnce = new Singleton2();
                }
            }
        }
        return instatnce;
    }

}
