package com.zhuchudong.designpattern.pattern.prototype;

/**
 * Created by Administrator on 2016/8/15.
 */
public class Client {
    public static void main(String[] args)  {
        Document document=new Document();
        document.setmText("text");
        document.addImage("picture1");
        document.addImage("picture2");

        //以 document 为原型，拷贝一份
        Document document1 =document.clone();
    }
}
