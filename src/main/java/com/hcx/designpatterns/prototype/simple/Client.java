package com.hcx.designpatterns.prototype.simple;

/**
 * 接收原型客户端
 * Created by hongcaixia on 2020/11/8.
 */
public class Client {

//    private Prototype prototype;

//    public Client(Prototype prototype){
//        this.prototype = prototype;
//    }

    public Prototype startClone(Prototype concretePrototype){
        return concretePrototype.clone();
    }

}
