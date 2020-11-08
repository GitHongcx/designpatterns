package com.hcx.designpatterns.singleton.serializable;

import java.io.Serializable;

/**
 * @Author hongcaixia
 * @Date 2020/10/25 16:37
 * @Version 1.0
 */
public class SerializableSingleton  implements Serializable {

    public  final static SerializableSingleton INSTANCE = new SerializableSingleton();

    private SerializableSingleton(){}

    public static SerializableSingleton getInstance(){
        return INSTANCE;
    }

    private  Object readResolve(){
        return  INSTANCE;
    }
}
