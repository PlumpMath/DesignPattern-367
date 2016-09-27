package com.zhuchudong.designpattern.pattern.abstractfactory.factory;

import com.zhuchudong.designpattern.pattern.abstractfactory.engine.IEngine;
import com.zhuchudong.designpattern.pattern.abstractfactory.engine.NormalEngine;
import com.zhuchudong.designpattern.pattern.abstractfactory.tire.ITire;
import com.zhuchudong.designpattern.pattern.abstractfactory.tire.NormalTire;

/**
 * 本田车工厂
 */
public class HFactory extends CarFactory {
    @Override
    public ITire createTire() {
        return new NormalTire();
    }

    @Override
    public IEngine createEngine() {
        return new NormalEngine();
    }
}
