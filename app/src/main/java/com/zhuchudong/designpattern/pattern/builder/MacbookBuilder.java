package com.zhuchudong.designpattern.pattern.builder;

/**
 * 具体的 Builder 类
 */
public class MacbookBuilder extends Builder {
    private Computer mComputer = new Macbook();

    @Override
    public void buildBoard(String board) {
        mComputer.setmBoard(board);
    }

    @Override
    public void buildDisplay(String display) {
        mComputer.setmDisplay(display);
    }

    @Override
    public void buildOS() {
        mComputer.setmOS();
    }

    @Override
    public Computer create() {
        return mComputer;
    }
}
