package com.hcx.designpatterns.singleton.register.enum1;

import com.hcx.designpatterns.singleton.register.enum1.EnumSingleton;

import java.lang.reflect.Constructor;

/**
 * 枚举不会被反射和反序列化破坏
 * Created by hongcaixia on 2020/11/8.
 */
public class EnumSingletonTest2 {

    public static void main(String[] args) {
        Class clazz = EnumSingleton.class;
        try {
            Constructor constructor = clazz.getDeclaredConstructor(String.class,int.class);
            constructor.setAccessible(true);
            EnumSingleton enumSingleton = (EnumSingleton)constructor.newInstance("hcx", 123456);
            System.out.println(enumSingleton);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
