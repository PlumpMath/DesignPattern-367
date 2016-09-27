package com.zhuchudong.designpattern.pattern.interator.example2.handle;

import com.zhuchudong.designpattern.pattern.interator.example2.request.AbstractRequest;

/**
 * Created by Administrator on 2016/9/26.
 */
public class Handle1 extends AbstractHandle {
    @Override
    protected int getHandleLevel() {
        return 1;
    }

    @Override
    protected void handle(AbstractRequest request) {
        System.out.println("好啦，被我处理啦");
    }
}
