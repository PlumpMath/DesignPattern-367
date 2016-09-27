package com.zhuchudong.designpattern.pattern.stragety;

/**
 * 策略模式
 *
 * 使用场景：
 *   针对同一类型的多种处理方式（本例子，不同交通工具的计费，不用使用判断在一个类中进行区分处理）
 *   需要安全的封装多种同一类型的操作时
 *   出现用一个抽象有多个子类，而又要使用 if-else switch-case 类选择子类的时候（本例子）
 */
public class Mainclass {
    public static void main(String[] args){
        TranficCalculator calculator=new TranficCalculator();
        calculator.setStrategy(new BusStrategy());
        calculator.calculatePrice(50);
    }
}
