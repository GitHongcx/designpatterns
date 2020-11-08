package com.hcx.designpatterns.singleton.lazy;

/**
 * 静态内部类
 * @Author hongcaixia
 * @Date 2020/10/25 13:54
 * @Version 1.0
 */
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton(){
        if(LazyHolder.lazyInnerClassSingleton!=null){
            throw new RuntimeException("实例只允许存在一份");
        }
    }

    public static final LazyInnerClassSingleton getInstance(){
        return LazyHolder.lazyInnerClassSingleton;
    }

    private static class LazyHolder{
        private static final LazyInnerClassSingleton lazyInnerClassSingleton = new LazyInnerClassSingleton();
    }
}
