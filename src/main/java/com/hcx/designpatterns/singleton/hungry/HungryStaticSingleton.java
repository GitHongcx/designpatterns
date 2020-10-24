package com.hcx.designpatterns.singleton.hungry;

/**
 * 饿汉式单例
 * @Author hongcaixia
 * @Date 2020/10/20 8:56
 * @Version 1.0
 */
public class HungryStaticSingleton {

    private static final HungryStaticSingleton hungrySingleton;

    static {
        hungrySingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton(){

    }

    public static HungryStaticSingleton getInstance(){
        return hungrySingleton;
    }

}
