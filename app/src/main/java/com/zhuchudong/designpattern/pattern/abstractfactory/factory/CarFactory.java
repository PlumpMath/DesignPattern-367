package com.zhuchudong.designpattern.pattern.abstractfactory.factory;

import com.zhuchudong.designpattern.pattern.abstractfactory.engine.IEngine;
import com.zhuchudong.designpattern.pattern.abstractfactory.tire.ITire;

/**
 * 抽象工厂模式
 * 在工厂方法模式中，BMW 和 H 这两种类型的车零部件差异非常大
 * 为创建一组相关或者是依赖的对象提供一个借接口，而不用指定具体类
 */
public abstract class CarFactory {
    public abstract ITire createTire();
    public abstract IEngine createEngine();
}
