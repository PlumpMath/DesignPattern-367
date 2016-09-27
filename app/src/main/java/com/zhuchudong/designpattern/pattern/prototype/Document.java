package com.zhuchudong.designpattern.pattern.prototype;

import java.util.ArrayList;

/**
 * 原型模式
 * 多用于创建复杂或者构造耗时的对象，复制一个已经存在的实例可以使程序运行更高效
 * 通过克隆这些原型的方法创建新的对象
 */
public class Document implements Cloneable {
    private String mText;
    private ArrayList<String> mImage = new ArrayList<String>();

    public Document() {
    }

    @Override
    protected Document clone() {
        Document document = null;
        try {
            document = (Document) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
        document.mText = this.mText;

        //浅拷贝，新旧对象的 mImage 指向同一个对象
        document.mImage = this.mImage;

        //深拷贝,新旧对象的 mImage 属于自己的对象
//        document.mImage = (ArrayList<String>) this.mImage.clone();
        return document;
    }

    public ArrayList<String> getmImage() {
        return mImage;
    }

    public void setmImage(ArrayList<String> mImage) {
        this.mImage = mImage;
    }

    public void addImage(String image) {
        this.mImage.add(image);
    }

    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }

}
