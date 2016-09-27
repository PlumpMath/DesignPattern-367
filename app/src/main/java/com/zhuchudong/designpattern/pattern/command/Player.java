package com.zhuchudong.designpattern.pattern.command;

/**
 * 命令模式
 * <p>
 * 定义：将一个请求封装成一个对象，从而让用户使用不同的请求把客户端参数化
 * 对请求排队或者记录请求日志，以及支持可撤销的操作
 * <p>
 * 使用场景：需要抽象出的待执行的动作，然后以参数的形式提供出来
 * 在不同的时刻指定、排列、和执行请求
 * 支持修改日志功能，这样当系统奔溃的时候，这些修改可以重做一遍
 * 需要支持事物操作
 * <p>
 * 例子是俄罗斯方块游戏
 */
public class Player {
    public static void main(String[] args) {

        //接收者角色 具体逻辑
        TetrisMachine machine = new TetrisMachine();

        //具体命令角色，调用接收者角色的方法
        LeftCommand leftCommand = new LeftCommand(machine);
        RightCommand rightCommand = new RightCommand(machine);
        FallCommand fallCommand = new FallCommand(machine);
        TransformCommand transformCommand = new TransformCommand(machine);

        //行动方法 调用命令对象执行具体的请求
        Buttons buttons = new Buttons();
        buttons.setLeftCommand(leftCommand);
        buttons.setRightCommand(rightCommand);
        buttons.setFallCommand(fallCommand);
        buttons.setTransformCommand(transformCommand);

        //具体操作玩家说了算
        buttons.toLeft();
        buttons.toRight();
        buttons.fall();
        buttons.transform();
    }
}
