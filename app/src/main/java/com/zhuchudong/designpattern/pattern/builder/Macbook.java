package com.zhuchudong.designpattern.pattern.builder;

/**
 * Created by Administrator on 2016/8/16.
 */
public class Macbook extends Computer {
    protected Macbook() {
    }

    @Override
    public void setmOS() {
       mOS = "Mac OS";
    }
}
