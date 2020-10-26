package chuangjian.prototype;

import java.io.*;
import java.util.Date;

public class Client_Cow {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Date birth = new Date(123423554);
        Cow cow = new Cow("奶牛", birth);

        //深拷贝：通过序列化和反序列化到内存Byte数组来实现深拷贝
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);
        objectOutputStream.writeObject(cow);//写对象
        byte[] bytes = out.toByteArray();
        //反序列化
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        Cow newCow = (Cow) objectInputStream.readObject();
        newCow.setName("深复制奶牛");

        System.out.println("cow = " + cow);
        System.out.println("newCow = " + newCow);

        System.out.println("------------------------------");
        birth.setTime(1234555699);

        System.out.println("cow = " + cow);
        System.out.println("newCow = " + newCow);

    }
}
