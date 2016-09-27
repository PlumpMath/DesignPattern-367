package com.zhuchudong.designpattern.pattern.abstractfactory.tire;

/**
 * 高性能轮胎
 */
public class ImportTire implements ITire{
    @Override
    public void tire() {
        System.out.println("高性能轮胎");
    }
}
