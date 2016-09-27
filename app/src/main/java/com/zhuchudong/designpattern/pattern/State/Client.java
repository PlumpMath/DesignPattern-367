package com.zhuchudong.designpattern.pattern.State;

/**
 * 状态模式
 * 当一个对象内的状态改变时，其行为跟着改变。
 * <p>
 * 使用场景：
 * 1.一个对象的行为取决于他的状态，并且在运行时根据状态改变行为
 * 2.代码中含有大量与对象有关的条件语句（使用了大量if-else switch-case）
 * <p>
 * 与策略模式的结构一样，但是，状态模式是平行的不可替换的，策略模式是彼此独立的，可相互替换
 * <p>
 * 优点：将繁琐的状态判断转化成结构清晰的状态类族，在避免代码膨胀时保证了可扩张性
 * 缺点：增加了系统类和对象的个数
 */
public class Client {
    public static void main(String[] args) {
        TvController tvController = new TvController();
        tvController.powerOn();
        tvController.nextChannel();
        tvController.turnDown();
        tvController.powerOff();
        tvController.turnUp();//此时没反应
    }
}
