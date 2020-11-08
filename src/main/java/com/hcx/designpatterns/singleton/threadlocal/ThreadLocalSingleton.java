package com.hcx.designpatterns.singleton.threadlocal;

/**
 * Created by hongcaixia on 2020/11/8.
 */
public class ThreadLocalSingleton {

    private ThreadLocalSingleton(){}

    private static final ThreadLocal<ThreadLocalSingleton> thredLocalInstance =
            new ThreadLocal<ThreadLocalSingleton>(){
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };


    public static ThreadLocalSingleton getInstance(){
        return thredLocalInstance.get();
    }
}
