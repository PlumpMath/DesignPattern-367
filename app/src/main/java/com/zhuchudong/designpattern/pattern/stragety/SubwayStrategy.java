package com.zhuchudong.designpattern.pattern.stragety;

/**
 * 地铁计费策略
 */
public class SubwayStrategy implements CalculateStrategy {
    @Override
    public int calculatePrice(int km) {
        return 80;
    }
}
