package com.zhuchudong.designpattern.pattern.interator.example3;

/**
 * 报销批复流程
 */
public abstract class Leader {
    protected Leader nextHandle;//上一级领导处理者

    public final void handleRequest(int money) {
        if (money <= linit()) {
            handle(money);
        } else {
            if (nextHandle != null) {
                nextHandle.handleRequest(money);
            }
        }
    }

    /**
     * 自身能批复的额度权限
     *
     * @return
     */
    public abstract int linit();

    public abstract void handle(int money);
}
