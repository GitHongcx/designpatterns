package com.hcx.designpatterns.singleton.hungry;

/**
 * 饿汉式单例
 * @Author hongcaixia
 * @Date 2020/10/20 8:56
 * @Version 1.0
 */
public class HungrySingleton {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){

    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

}
