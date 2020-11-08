package com.hcx.designpatterns.singleton.lazy;

/**
 * @Author hongcaixia
 * @Date 2020/10/25 12:18
 * @Version 1.0
 */
public class ExecutorThread implements Runnable{
    @Override
    public void run() {
        LazySimpleSingleton lazySimpleSingleton = LazySimpleSingleton.getInstance();
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName()+":"+lazySimpleSingleton);
    }
}
