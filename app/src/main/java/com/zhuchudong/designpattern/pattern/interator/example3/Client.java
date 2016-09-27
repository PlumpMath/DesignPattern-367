package com.zhuchudong.designpattern.pattern.interator.example3;

/**
 * Created by Administrator on 2016/9/27.
 */
public class Client {
    public static void main(String[] args) {
        GroupLeader groupLeader = new GroupLeader();
        ManagerLeader managerLeader = new ManagerLeader();
        BossLeader bossLeader = new BossLeader();

        groupLeader.nextHandle = managerLeader;
        managerLeader.nextHandle = bossLeader;

        groupLeader.handleRequest(40000);
    }
}
