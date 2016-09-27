package com.zhuchudong.designpattern.pattern.interator.example3;

/**
 * Created by Administrator on 2016/9/27.
 */
public class ManagerLeader extends Leader {
    @Override
    public int linit() {
        return 10000;
    }

    @Override
    public void handle(int money) {
        System.out.println("经理进行了批复");
    }
}
