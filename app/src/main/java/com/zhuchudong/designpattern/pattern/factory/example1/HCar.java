package com.zhuchudong.designpattern.pattern.factory.example1;

/**
 * 具体产品类
 *
 */
public class HCar extends Car {
    @Override
    public void drive() {
        System.out.println("本田启动了");
    }

    @Override
    public void selfNavigation() {
        System.out.println("本田自动导航");
    }
}
