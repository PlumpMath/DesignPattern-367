package com.zhuchudong.designpattern.pattern.abstractfactory;

import com.zhuchudong.designpattern.pattern.abstractfactory.factory.BMWFactory;
import com.zhuchudong.designpattern.pattern.abstractfactory.factory.CarFactory;
import com.zhuchudong.designpattern.pattern.abstractfactory.factory.HFactory;

/**
 * Created by Administrator on 2016/8/24.
 */
public class Mainclass  {
    public static void main(String[] args){
        CarFactory factoryBMW =new BMWFactory();
        factoryBMW.createTire().tire();
        factoryBMW.createEngine().engine();

        CarFactory factoryH =new HFactory();
        factoryH.createTire().tire();
        factoryH.createEngine().engine();
    }
}
