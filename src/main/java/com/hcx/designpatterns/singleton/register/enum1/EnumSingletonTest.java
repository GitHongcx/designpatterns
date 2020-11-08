package com.hcx.designpatterns.singleton.register.enum1;

import com.hcx.designpatterns.singleton.register.enum1.EnumSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @Author hongcaixia
 * @Date 2020/10/25 17:55
 * @Version 1.0
 */
public class EnumSingletonTest {

    public static void main(String[] args) {
        //反序列化出来的对象
        EnumSingleton s1 = null;
        //通过单例创建的对象
        EnumSingleton s2 = EnumSingleton.getInstance();
        s2.setData(new Object());

        FileOutputStream fos = null;

        try {
            //把对象通过文件形式写入磁盘
            fos =  new FileOutputStream("EnumSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();

            //通过反序列化把对象从磁盘中读取出来
            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (EnumSingleton)ois.readObject();
            ois.close();

            System.out.println(s1.getData()); //java.lang.Object@3d494fbf
            System.out.println(s2.getData()); //java.lang.Object@3d494fbf
            System.out.println(s1.getData()==s2.getData()); //true

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
