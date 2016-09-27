package com.zhuchudong.designpattern.pattern.builder;

/**
 * 是一步一步创建复杂对象的创建型模式
 * 将创建复杂对象的过程和它的部件解耦
 *
 * 使用场景：
 * 1.相同的方法，不同的执行顺序，产生不同的时间结果
 * 2.多个部件或者零件，都可以装配到一个对象中，但是产生的运行结果不相同
 * 3.产品类非常复杂，或者产品类中的调用顺序不同产生了不同的作用
 * 4.初始化一个类非常复杂，且很多参数都有默认值
 *
 * UML:
 * Product 产品类
 * Builder 抽象Builder类，规范产品的创建，一般由子类实现具体的组建过程
 * ConcreteBuilder 具体的 Builder 类
 * Director 统一组装过程
 *
 * 本类以组装一台电脑为例子
 *
 */
public abstract class Builder {
    //设置主机
    public abstract void buildBoard(String board);
    //设置显示器
    public abstract void buildDisplay(String display);
    //设置操作系统
    public abstract void buildOS();
    //创建Computer
    public abstract Computer create();
}
