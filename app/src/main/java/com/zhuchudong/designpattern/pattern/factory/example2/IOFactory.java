package com.zhuchudong.designpattern.pattern.factory.example2;

/**
 * 具体工厂类
 */
public class IOFactory {
    public static <T extends IOHandle> T getIOHandle(Class<T> clz) {
        IOHandle handle = null;
        try {
            handle = (IOHandle) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) handle;
    }
}
