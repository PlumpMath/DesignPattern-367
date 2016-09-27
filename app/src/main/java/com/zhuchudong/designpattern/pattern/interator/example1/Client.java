package com.zhuchudong.designpattern.pattern.interator.example1;

/**
 * 责任链模式（行为型设计模式）
 *
 * 定义：使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系
 *      将这些对象连成一条链，并沿着这条链传递该请求，知道有对象处理它为止。
 *
 * 使用场景：多个对象可以处理同一个请求，但具体由哪个对象处理则在运行时动态决定
 */
public class Client {
    public static void main(String[] args) {
        ConcreteHandle1 handle1 = new ConcreteHandle1();
        ConcreteHandle2 handle2 = new ConcreteHandle2();
        handle1.successor = handle2;
        handle2.successor = handle1;
        handle1.handleRequest("ConcreteHandle2");
    }
}
