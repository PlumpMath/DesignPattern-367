package com.zhuchudong.designpattern.pattern.interator.example1;

/**
 * 抽象处理者角色，声明一个请求处理方法，并在其中保持一个对下一个处理节点Handle对象的引用
 */
public abstract class Handle {
    protected Handle successor;

    public abstract void handleRequest(String condition);
}
