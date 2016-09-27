package com.zhuchudong.designpattern.pattern.stragety;

/**
 * 用来操作策略的上下文环境 Context
 *
 */
public class TranficCalculator {
    CalculateStrategy strategy;
    public void setStrategy(CalculateStrategy strategy ){
        this.strategy=strategy;
    }
    public int calculatePrice(int km){
        return strategy.calculatePrice(50);
    }
}
