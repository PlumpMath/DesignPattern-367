package com.zhuchudong.designpattern.pattern.abstractfactory.engine;

/**
 * 高性能发动机
 */
public class ImportEngine implements IEngine {
    @Override
    public void engine() {
        System.out.println("高性能发动机");
    }
}
