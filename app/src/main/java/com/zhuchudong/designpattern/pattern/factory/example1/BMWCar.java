package com.zhuchudong.designpattern.pattern.factory.example1;

/**
 * 具体产品类
 */
public class BMWCar extends Car {
    @Override
    public void drive() {
        System.out.println("宝马启动了");
    }

    @Override
    public void selfNavigation() {
        System.out.println("宝马自动导航");
    }
}
