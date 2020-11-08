package com.hcx.designpatterns.singleton.threadlocal;

import com.hcx.designpatterns.singleton.lazy.ExecutorThread;

/**
 * Created by hongcaixia on 2020/11/8.
 */
public class ThreadLocalSingletonTest {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        Thread thread1 = new Thread(new ExecutorThread());
        Thread thread2 = new Thread(new ExecutorThread());

        thread1.start();
        thread2.start();
        System.out.println("==============");
    }
}
