package com.zhuchudong.designpattern.pattern.interator.example1;

/**
 * 具体处理者角色，对请求进行处理，如果不能处理则将请求转发给下一个节点的处理对象
 */
public class ConcreteHandle2 extends Handle {
    @Override
    public void handleRequest(String condition) {
        if (condition.equalsIgnoreCase("ConcreteHandle2")) {
            System.out.println("ConcreteHandle2 已经进行处理");
            return;
        } else {
            successor.handleRequest(condition);
        }
    }
}
