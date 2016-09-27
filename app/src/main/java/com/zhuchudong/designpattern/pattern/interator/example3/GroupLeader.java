package com.zhuchudong.designpattern.pattern.interator.example3;

/**
 * Created by Administrator on 2016/9/27.
 */
public class GroupLeader extends Leader {
    @Override
    public int linit() {
        return 1000;
    }

    @Override
    public void handle(int money) {
        System.out.println("主管进行了批复");
    }
}
