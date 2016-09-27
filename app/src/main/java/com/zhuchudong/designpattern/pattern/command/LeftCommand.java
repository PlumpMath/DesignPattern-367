package com.zhuchudong.designpattern.pattern.command;

/**
 * 具体命令
 */
public class LeftCommand implements Command {
    //持有一个接收者对象的引用
    private TetrisMachine machine;

    public LeftCommand(TetrisMachine machine) {
        this.machine = machine;
    }

    @Override
    public void execute() {
        machine.toLeft();
    }
}
