package com.zhuchudong.designpattern.pattern.interator.example2.handle;

import com.zhuchudong.designpattern.pattern.interator.example2.request.AbstractRequest;

/**
 * 抽象处理者
 * 声明了处理者对象处理请求的方法和获取处理级别的方法，并对具体的处理转发逻辑进行了实现
 */
public abstract class AbstractHandle {
    public AbstractHandle nextHandle;

    public final void handleRequest(AbstractRequest request) {

        if (getHandleLevel() == request.getRequestLevel()) {
            handle(request);
        } else {
            if (nextHandle != null) {
                nextHandle.handleRequest(request);
            } else {
                System.out.println("没人处理");
            }
        }
    }

    /**
     * 获得处理者对象的处理级别
     *
     * @return
     */
    protected abstract int getHandleLevel();

    /**
     * 具体处理请求方法
     *
     * @param request
     */
    protected abstract void handle(AbstractRequest request);
}
