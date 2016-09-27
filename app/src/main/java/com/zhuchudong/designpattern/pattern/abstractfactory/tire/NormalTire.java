package com.zhuchudong.designpattern.pattern.abstractfactory.tire;

/**
 * 普通轮胎
 */
public class NormalTire implements ITire {
    @Override
    public void tire() {
        System.out.println("普通轮胎");
    }
}
