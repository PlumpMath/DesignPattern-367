package com.zhuchudong.designpattern.pattern.builder;

/**
 * Director类 负责创建 Computer
 * 在开发工程中经常会被省略掉
 */
public class Director {
    Builder mBuilder=null;
    public Director(Builder builder){
        mBuilder=builder;
    }
    public void construct(String board,String display){
        mBuilder.buildBoard(board);
        mBuilder.buildDisplay(display);
        mBuilder.buildOS();
    }
}
