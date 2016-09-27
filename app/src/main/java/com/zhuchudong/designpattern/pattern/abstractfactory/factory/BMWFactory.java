package com.zhuchudong.designpattern.pattern.abstractfactory.factory;

import com.zhuchudong.designpattern.pattern.abstractfactory.engine.IEngine;
import com.zhuchudong.designpattern.pattern.abstractfactory.engine.ImportEngine;
import com.zhuchudong.designpattern.pattern.abstractfactory.tire.ITire;
import com.zhuchudong.designpattern.pattern.abstractfactory.tire.ImportTire;

/**
 * 宝马车工厂
 */
public class BMWFactory extends CarFactory {
    @Override
    public ITire createTire() {
        return new ImportTire();
    }

    @Override
    public IEngine createEngine() {
        return new ImportEngine();
    }
}
