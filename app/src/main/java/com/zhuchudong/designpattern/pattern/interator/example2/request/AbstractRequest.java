package com.zhuchudong.designpattern.pattern.interator.example2.request;

/**
 *
 */
public abstract class AbstractRequest {
    private Object object; //处理对象

    public AbstractRequest(Object object) {
        this.object = object;
    }

    /**
     * 获得处理的请求对象
     *
     * @return
     */
    public Object getContent() {
        return object;
    }

    /**
     * 获得请求的级别
     *
     * @return
     */
    public abstract int getRequestLevel();
}
