package com.zhuchudong.designpattern.pattern.factory.example1;

/**
 * 抽象工厂类
 */
public abstract class Factory {
    public abstract <T extends Car> T createCasr(Class<T> clz);
}
