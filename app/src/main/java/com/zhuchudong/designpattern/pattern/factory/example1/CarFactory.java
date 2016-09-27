package com.zhuchudong.designpattern.pattern.factory.example1;

/**
 *具体工厂类
 */
public class CarFactory extends Factory {
    @Override
    public <T extends Car> T createCasr(Class<T> clz) {
        Car car = null;
        try {
            car = (Car) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) car;
    }
}
