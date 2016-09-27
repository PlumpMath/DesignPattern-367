package com.zhuchudong.designpattern.pattern.abstractfactory.engine;

/**
 * 普通发动机
 */
public class NormalEngine implements IEngine{
    @Override
    public void engine() {
        System.out.println("普通发动机");
    }
}
