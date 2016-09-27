package com.zhuchudong.designpattern.pattern.factory;

import com.zhuchudong.designpattern.pattern.factory.example1.BMWCar;
import com.zhuchudong.designpattern.pattern.factory.example1.CarFactory;
import com.zhuchudong.designpattern.pattern.factory.example1.HCar;
import com.zhuchudong.designpattern.pattern.factory.example2.DBHandle;
import com.zhuchudong.designpattern.pattern.factory.example2.FileHandle;
import com.zhuchudong.designpattern.pattern.factory.example2.IOFactory;
import com.zhuchudong.designpattern.pattern.factory.example2.IOHandle;

/**
 * 工厂方法模式
 * 用于创建复杂对象
 * 主方法
 */
public class Mainclass {
    public static void main(String[] args) {

        //example1
        CarFactory factory = new CarFactory();

        BMWCar bmwCar = factory.createCasr(BMWCar.class);
        bmwCar.drive();
        bmwCar.selfNavigation();

        HCar hCar = factory.createCasr(HCar.class);
        hCar.drive();
        hCar.selfNavigation();

        //example2
        IOHandle fileHandle = IOFactory.getIOHandle(FileHandle.class);
        fileHandle.query("11");

        IOHandle dbHandle = IOFactory.getIOHandle(DBHandle.class);
        dbHandle.add("11", "you");
    }
}

