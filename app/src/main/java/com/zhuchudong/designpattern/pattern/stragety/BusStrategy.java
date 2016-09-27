package com.zhuchudong.designpattern.pattern.stragety;

/**
 * 公交车计费策略
 */
public class BusStrategy implements CalculateStrategy {
    @Override
    public int calculatePrice(int km) {
        return 50;
    }
}
