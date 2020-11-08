package com.hcx.designpatterns.singleton.serializable;

import java.io.*;

/**
 * 序列化破坏单例
 * @Author hongcaixia
 * @Date 2020/10/25 16:34
 * @Version 1.0
 */
public class SerializableSingletonTest {

    public static void main(String[] args) {
        //反序列化出来的对象
        SerializableSingleton s1 = null;
        //通过单例创建的对象
        SerializableSingleton s2 = SerializableSingleton.getInstance();

        FileOutputStream fos = null;

        try {
            //把对象通过文件形式写入磁盘
            fos =  new FileOutputStream("SerializableSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();

            //通过反序列化把对象从磁盘中读取出来
            FileInputStream fis = new FileInputStream("SerializableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (SerializableSingleton)ois.readObject();
            ois.close();

            System.out.println(s1); //com.hcx.designpatterns.singleton.serializable.SerializableSingleton@9807454
            System.out.println(s2); //com.hcx.designpatterns.singleton.serializable.SerializableSingleton@27c170f0
            System.out.println(s1==s2); //false

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
