package com.hcx.designpatterns.singleton.lazy;

/**
 * @Author hongcaixia
 * @Date 2020/10/25 12:02
 * @Version 1.0
 */
public class LazySimpleSingleton {

    private static LazySimpleSingleton lazySimpleSingleton = null;

    private LazySimpleSingleton(){}

    //添加了synchronized 性能低，可能会造成死锁，为类锁
    public synchronized static LazySimpleSingleton getInstance(){
        if(lazySimpleSingleton==null){
            lazySimpleSingleton = new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }

}
