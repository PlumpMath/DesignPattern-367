package com.zhuchudong.designpattern.pattern.interator.example3;

/**
 * Created by Administrator on 2016/9/27.
 */
public class BossLeader extends Leader {
    @Override
    public int linit() {
        return 50000;
    }

    @Override
    public void handle(int money) {
        System.out.println("老板进行了批复");
    }
}
