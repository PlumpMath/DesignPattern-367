package com.zhuchudong.designpattern.pattern.interator.example2.request;

/**
 * Created by Administrator on 2016/9/26.
 */
public class Request1 extends AbstractRequest {
    public Request1(Object object) {
        super(object);
    }

    @Override
    public int getRequestLevel() {
        return 1;
    }
}
