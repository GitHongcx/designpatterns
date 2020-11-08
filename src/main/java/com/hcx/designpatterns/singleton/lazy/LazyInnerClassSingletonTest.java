package com.hcx.designpatterns.singleton.lazy;

import java.lang.reflect.Constructor;

/**
 * 反射攻击
 * @Author hongcaixia
 * @Date 2020/10/25 15:46
 * @Version 1.0
 */
public class LazyInnerClassSingletonTest {

    public static void main(String[] args) {
        Class<?> clazz = LazyInnerClassSingleton.class;
        try {
            Constructor<?> declaredConstructor = clazz.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            Object object1 = declaredConstructor.newInstance(); //这里就创建不了了 是为什么
            Object object2 = LazyInnerClassSingleton.getInstance();
            System.out.println(object1==object2); //false 破坏了单例
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
