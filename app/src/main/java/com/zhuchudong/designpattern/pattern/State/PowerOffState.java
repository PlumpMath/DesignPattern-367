package com.zhuchudong.designpattern.pattern.State;

/**
 * 关机状态，此时只有开机功能有效
 */
public class PowerOffState implements TvState{
    @Override
    public void nextChannel() {

    }

    @Override
    public void prevChannel() {

    }

    @Override
    public void turnUp() {

    }

    @Override
    public void turnDown() {

    }
}
