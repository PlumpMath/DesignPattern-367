package com.zhuchudong.designpattern.pattern.factory.example2;

/**
 * 抽象产品类
 */
public abstract class IOHandle {
    public abstract void add(String id, String name);

    public abstract void remove(String id);

    public abstract void update(String id, String name);

    public abstract void query(String id);
}
