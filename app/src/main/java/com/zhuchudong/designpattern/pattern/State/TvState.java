package com.zhuchudong.designpattern.pattern.State;

/**
 * 电视状态接口类，定义了电视的操作函数
 */
public interface TvState {
    public void nextChannel();

    public void prevChannel();

    public void turnUp();

    public void turnDown();
}
