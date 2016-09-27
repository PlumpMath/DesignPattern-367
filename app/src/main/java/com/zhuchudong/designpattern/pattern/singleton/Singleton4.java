package com.zhuchudong.designpattern.pattern.singleton;

/**
 * 枚举实例
 * 线程安全 只有一个单例
 * 永远只有一个实例，前面三种方法，在反序列化的时候会重新创建
 */
public enum Singleton4 {
    INSTANCE;
    public void doSomething(){
        System.out.print("1111");
    }
}
