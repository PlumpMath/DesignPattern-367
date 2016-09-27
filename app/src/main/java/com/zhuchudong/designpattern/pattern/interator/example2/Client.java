package com.zhuchudong.designpattern.pattern.interator.example2;

import com.zhuchudong.designpattern.pattern.interator.example2.handle.AbstractHandle;
import com.zhuchudong.designpattern.pattern.interator.example2.handle.Handle1;
import com.zhuchudong.designpattern.pattern.interator.example2.handle.Handle2;
import com.zhuchudong.designpattern.pattern.interator.example2.request.AbstractRequest;
import com.zhuchudong.designpattern.pattern.interator.example2.request.Request1;
import com.zhuchudong.designpattern.pattern.interator.example2.request.Request2;

/**
 * Created by Administrator on 2016/9/27.
 */
public class Client {
    public static void main(String[] args) {
        AbstractHandle handle1 = new Handle1();
        AbstractHandle handle2 = new Handle2();

        handle1.nextHandle = handle2;

        AbstractRequest request1 = new Request1("Request1");
        AbstractRequest request2 = new Request2("Request2");

        handle1.handleRequest(request1);
        handle1.handleRequest(request2);

    }
}
